/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.strings;

import java.io.PrintStream;
import java.util.Scanner;

public class PigTranslatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        PrintStream output = System.out;

        output.println("Welcome to the Pig Latin Translator!");
        do {
            // Input
            String englishSentence = promptSentence(input, output);

            // Process
            String translatedSentence = PigTranslator.translate(englishSentence);

            // Output
            output.println(translatedSentence);
        } while ("y".equalsIgnoreCase(promptContinueTranslating(input, output)));

        output.println("Bye!");

        input.close();
    }

    // Following two methods belong to Console/Validation classes

    private static String promptContinueTranslating(Scanner input, PrintStream output) {
        output.println("Translate another line? (y/n):");
        return input.next().trim();
    }

    private static String promptSentence(Scanner input, PrintStream output) {
        output.println("Enter a line to be translated:");
        String sentence = input.next();
        if ("".equals(sentence.trim())) {
            return promptSentence(input, output);
        }
        return sentence;
    }
}
