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

        output.println(prompt);
        String numeric = input.next();

        try {
            number = Integer.parseInt(numeric);
        } catch (NumberFormatException e) {
            return getInt(prompt);
        }

        return number;
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int number = getInt(prompt);
        if (min > number || number > max) {
            return getIntWithinRange(prompt, min, max);
        }
        return input.nextInt();
    }

    public double getDouble(String prompt) {
        double number;

        output.println(prompt);
        String numeric = input.next();

        try {
            number = Double.parseDouble(numeric);
        } catch (NumberFormatException e) {
            return getDouble(prompt);
        }

        return number;
    }

    public double getDoubleWithinRange(String prompt, double min, double max) {
        output.println(prompt);
        double number = getDouble(prompt);

        if (min > number || number > max) {
            return getDoubleWithinRange(prompt, min, max);
        }

        return number;
    }
}
