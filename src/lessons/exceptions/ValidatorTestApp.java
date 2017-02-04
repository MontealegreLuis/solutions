/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.exceptions;

import java.io.PrintStream;
import java.util.Scanner;

public class ValidatorTestApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        PrintStream output = System.out;
        OOValidator validator = new OOValidator(input, output);

        output.println("Welcome to the Validation Tester application");
        // Values to be entered for both integers and doubles are: x, -101, 101, 100

        output.println("Int Test");
        validator.getIntWithinRange(
            "Enter an integer between -100 and 100: ",
            -100,
            100
        );

        output.println("Double Test");
        validator.getDoubleWithinRange(
            "Enter any number between -100 and 100: ",
            -100,
            100
        );
    }
}
