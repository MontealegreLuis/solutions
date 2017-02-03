/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.exceptions;

import java.io.PrintStream;
import java.util.Scanner;

public class MyValidator extends OOValidator {
    public MyValidator(Scanner input, PrintStream output) {
        super(input, output);
    }

    public String getRequiredString(String prompt) {
        output.println(prompt);
        String required = input.next();

        if (required.trim().isEmpty()) {
            return getRequiredString(prompt);
        }

        return required;
    }
    public String getChoiceString(String prompt, String s1, String s2){
        output.println(prompt);
        String choice = getRequiredString(prompt);
        if (!choice.equalsIgnoreCase(s1) && !choice.equalsIgnoreCase(s2)) {
            getChoiceString(prompt, s1, s2);
        }
        return choice;
    }
}
