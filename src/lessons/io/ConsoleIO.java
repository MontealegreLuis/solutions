/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.io;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;

        // Read an integer value
        output.println("Enter an integer value");
        int anIntegerValue = input.nextInt();
        output.println("The number you entered is " + anIntegerValue);
        // `nextInt` does not consume the last newline character \n
        input.nextLine(); // consume it

        // Read a sentence
        output.println("Enter a sentence");
        String sentence = input.nextLine();
        output.println("The sentence is: " + sentence);

        // Read three words
        output.println("Enter three words");
        output.println("First word");
        String first = input.next();
        output.println("Second word");
        String second = input.next();
        output.println("Third word");
        String third = input.next();

        output.println("You have entered " + first + " " + second + " " + third);

        input.close();
    }
}
