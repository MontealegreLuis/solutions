package lessons.strings;

import java.util.ArrayList;
import java.util.List;

public class PigTranslator {

    public static String translate(String sentence) {
        String[] words;
        List<String> pigLatinWords = new ArrayList<>();
        words = sentence.split(" ");
        for (String word : words) {
            pigLatinWords.add(translateWord(word.trim()));
        }
        return String.join(" ", pigLatinWords);
    }

    public static String translateWord(String word) {

        if (!isAlphabetic(word)) {
            return word;
        }

        char firstCharacter = word.toLowerCase().charAt(0);
        if (isAVowel(firstCharacter)) {
            return word + "way";
        }

        if (isAConsonant(firstCharacter)) {
            int firstVowelIndex = firstVowelIndex(word.toLowerCase(), word.length());
            return word.substring(firstVowelIndex, word.length())
                    + word.substring(0, firstVowelIndex)
                    + "ay";
        }
        return word;
    }

    private static boolean isAlphabetic(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isAlphabetic(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAConsonant(char firstCharacter) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(firstCharacter) >= 0;
    }

    private static boolean isAVowel(char firstCharacter) {
        return "aeiou".indexOf(firstCharacter) >= 0;
    }

    private static int firstVowelIndex(String word, int lastIndex) {
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    return i;
            }
        }
        return lastIndex;
    }
}
