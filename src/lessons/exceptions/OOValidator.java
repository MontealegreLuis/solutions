/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.exceptions;

import java.io.PrintStream;
import java.util.Scanner;

public class OOValidator {
    protected final Scanner input;
    protected final PrintStream output;

    public OOValidator(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
    }

    public int getInt(String prompt) {
        int number;

        output.print(prompt);
        String numeric = input.next();

        try {
            number = Integer.parseInt(numeric);
        } catch (NumberFormatException e) {
            output.println("Error! Invalid integer value. Try again.");
            return getInt(prompt);
        }

        return number;
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int number = getInt(prompt);
        if (number < min) {
            output.println("Error! Number must be greater than " + number);
            return getIntWithinRange(prompt, min, max);
        }
        if (number > max) {
            output.println("Error! Number must be less than " + number);
            return getIntWithinRange(prompt, min, max);
        }
        return number;
    }

    public double getDouble(String prompt) {
        double number;

        output.print(prompt);
        String numeric = input.next();

        try {
            number = Double.parseDouble(numeric);
        } catch (NumberFormatException e) {
            output.println("Error! Invalid decimal value. Try again.");
            return getDouble(prompt);
        }

        return number;
    }

    public double getDoubleWithinRange(String prompt, double min, double max) {
        double number = getDouble(prompt);

        if (number < min) {
            output.println("Error! Number must be greater than " + number);
            return getDoubleWithinRange(prompt, min, max);
        }

        if (number > max) {
            output.println("Error! Number must be less than " + number);
            return getDoubleWithinRange(prompt, min, max);
        }

        return number;
    }
}
