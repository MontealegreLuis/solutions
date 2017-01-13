/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.controlstatements;

import java.io.PrintStream;
import java.util.Scanner;

public class TableOfPowers {
    public static void main(String[] args) {
        PrintStream output = System.out;
        Scanner input = new Scanner(System.in);

        do {
            output.println("Enter a number");
            int limit = input.nextInt();

            output.println("Number | Square | Cube");
            for (int i = 1; i <= limit; i++) {
                output.println(
                    padRight(String.valueOf(i), 6) + " | " +
                    padRight(String.valueOf(square(i)), 6) + " | " +
                    padRight(String.valueOf(cube(i)), 4)
                );
            }

            output.println("Do you want to continue (y/n)");
        } while (input.next().trim().equalsIgnoreCase("y"));
    }

    private static String padRight(String text, int numberOfCharacters) {
        return String.format("%1$-" + numberOfCharacters + "s", text);
    }

    private static int cube(int i) {
        return i * i * i;
    }

    private static int square(int i) {
        return i * i;
    }
}
