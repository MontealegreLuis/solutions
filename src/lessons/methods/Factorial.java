/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.methods;

import java.io.PrintStream;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        PrintStream output = System.out;
        Scanner input = new Scanner(System.in);

        // I've made the solution to this one, procedural. So that I can contrast it
        // against an object oriented solution.

        do {
            // input
            int number = promptNumber(input, output);

            // process
            long factorial = calculateFactorial(number);

            // output
            showFactorial(output, number, factorial);

        } while ("y".equalsIgnoreCase(promptContinue(input, output)));
    }

    private static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static String promptContinue(Scanner input, PrintStream output) {
        output.println("Do you want to continue? (y/n)");
        return input.next();
    }

    private static int promptNumber(Scanner input, PrintStream output) {
        output.println("Enter a number between 1 and 10");
        int number = input.nextInt();

        if (number < 1 || number > 10) {
            return promptNumber(input, output);
        }
        return number;
    }

    private static void showFactorial(PrintStream output, int number, long factorial) {
        output.println("The factorial of " + number + " is " + factorial);
    }
}
