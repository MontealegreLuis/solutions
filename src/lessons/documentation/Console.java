/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.documentation;

import java.io.PrintStream;
import java.util.Scanner;

public class Console {
    private final Scanner input;
    private final PrintStream output;

    public Console(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
    }

    public void print(String message) {
        output.print(message);
    }

    public void println(String message) {
        output.println(message);
    }

    public void println() {
        output.println();
    }

    public String getRequiredString(String prompt) {
        output.println(prompt);
        String required = input.next();

        if (required.trim().isEmpty()) {
            return getRequiredString(prompt);
        }

        return required;
    }

    public String getChoiceString(String prompt, String option1, String option2) {
        output.println(prompt);
        String option = input.next();

        if (!option1.equalsIgnoreCase(option) && !option2.equalsIgnoreCase(option)) {
            return getChoiceString(prompt, option1, option2);
        }

        return option;
    }

    public int getInt(String prompt) {
        output.println(prompt);
        int number;

        try {
            String numeric = input.next();
            number = Integer.parseInt(numeric);
        } catch (NumberFormatException e) {
            return getInt(prompt);
        }

        return number;
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int number;
        do {
            number = getInt(prompt);
        } while (min > number || number > max);
        return number;
    }

    public double getDouble(String prompt) {
        return 0.0;
    }

    public double getDoubleWithinRange(String prompt, double min, double max) {
        return 0.0;
    }
}
