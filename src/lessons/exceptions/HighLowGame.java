/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.exceptions;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class HighLowGame {
    public static void main(String[] args) {
        PrintStream output = System.out;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String message;
        int numberToGuess;
        int guess;

        numberToGuess = randomNumber(random);
        do {
            guess = promptGuess(output, input);
            message = provideFeedBack(numberToGuess, guess);
            showFeedBack(output, message);
        } while (guess != numberToGuess);
    }

    // Following 2 methods could be a GameConsole object

    private static int promptGuess(PrintStream output, Scanner input) {
        output.println("Choose a number between 1 and 100");
        return input.nextInt();
    }

    private static void showFeedBack(PrintStream output, String message) {
        output.println(message);
    }

    // Following 2 methods would belong to a Game object

    private static String provideFeedBack(int target, int guess) {
        String message;
        if (guess == target) {
            message = "Good guess!";
        } else if (guess < target) {
            message = "HIGHER!";
        } else {
            message = "LOWER!";
        }
        return message;
    }

    private static int randomNumber(Random random) {
        return random.nextInt(100) + 1;
    }
}
