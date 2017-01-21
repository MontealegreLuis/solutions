/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.methods;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class RollDice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;
        Random random = new Random();

        do {
            int sides = promptSides(input, output);
            output.println("First dice: " + randomSide(random, sides));
            output.println("Second dice: " + randomSide(random, sides));
        } while ("y".equalsIgnoreCase(promptContinue(input, output)));
    }

    private static String promptContinue(Scanner input, PrintStream output) {
        output.println("Do you want to continue? (y/n)");
        return input.next();
    }

    private static int promptSides(Scanner input, PrintStream output) {
        output.println("Number of sides for a pair of dice");
        return input.nextInt();
    }

    private static int randomSide(Random random, int sides) {
        return random.nextInt(sides) + 1;
    }
}
