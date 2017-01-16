/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.controlstatements;

import java.io.PrintStream;
import java.util.Scanner;

public class NumberToLetterGrades {
    public static void main(String[] args) {
        PrintStream output = System.out;
        Scanner input = new Scanner(System.in);

        do {
            int numericGrade = promptNumericGrade(input, output);
            output.println("Your grade is " + convertToLetterGrade(numericGrade));
        } while ("y".equalsIgnoreCase(promptContinueConverting(input, output)));
    }

    private static String convertToLetterGrade(int numericGrade) {
        String grade;

        if (numericGrade >= 88) {
            grade = "A";
        } else if (numericGrade >= 80) {
            grade = "B";
        } else if (numericGrade >= 67) {
            grade = "C";
        } else if (numericGrade >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        return grade;
    }

    private static int promptNumericGrade(Scanner input, PrintStream output) {
        output.println("Enter a grade between 1 and 100");
        int grade = input.nextInt();

        if (grade < 0 || grade > 100) {
            return promptNumericGrade(input, output);
        }

        return grade;
    }

    private static String promptContinueConverting(Scanner input, PrintStream output) {
        output.println("Do you want continue converting your grades?");

        return input.next();
    }
}
