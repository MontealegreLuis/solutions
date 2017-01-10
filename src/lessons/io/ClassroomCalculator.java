/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.io;

import java.io.PrintStream;
import java.util.Scanner;

public class ClassroomCalculator {
    public static void main(String[] args) {
        // I like to keep System.out and Scanner(System.in) as variables,
        // because you can perform refactorings on them, and you're enforcing the
        // concept of program input -> process -> output.
        // For instance, you can create a method to ask the user for the width.
        // Then you can extract a method promptDouble(input, output, message)
        // You can also extract promptCharacter(input, output, message) to ask the user
        // if she wants to continue.
        // You'll realize that you're passing input and output most of the times, and the
        // only real variable is message, you'll soon discover that you can extract a
        // class `Console` for instance (following the naming in JS).
        // Ending up with calls to console.promptDouble(message),
        // console.promptCharacter(message), console.display(message), etc.
        PrintStream output = System.out;
        Scanner input = new Scanner(System.in);

        do {
            // Highlight the need of specifying a scale with any numeric variable
            // as it has a meaning, even more important than the fact it is a number.
            // This scale should be part of the variable's name.
            output.println("What's the length of the classroom? (in meters)?");
            double lengthInMeters = input.nextDouble();
            output.println("What's the width of the classroom? (in meters)?");
            double widthInMeters = input.nextDouble();

            double perimeterInMeters = lengthInMeters * 2 + widthInMeters * 2;
            output.println("The perimeter of the classroom is: " + perimeterInMeters + "m");

            double areaInSquareMeters = lengthInMeters * widthInMeters;
            output.println("The area of the classroom is: " + areaInSquareMeters + "m^2");

            input.nextLine(); // clean up last `\n` not consumed by `nextDouble`

            output.println("Do you want to continue?");
        } while (input.nextLine().equalsIgnoreCase("y"));
    }
}
