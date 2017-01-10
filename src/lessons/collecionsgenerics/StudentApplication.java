/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.collecionsgenerics;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        PrintStream output = System.out;
        ArrayList<Student> students = new ArrayList<>();

        do {
            // The repetition in parameters for the `prompt` methods is a sign for a
            // class
            String firstName = promptFirstName(input, output);
            // Also notice the repetition in structure of these methods
            String lastName = promptLastName(input, output);
            // All of this methods have 2 responsibilities input/output and validation
            // it means we have at least 2 roles Console and Validator (or objects)
            int score = promptScore(input, output);

            Student newStudent = new Student(firstName, lastName, score);
            students.add(newStudent);

        } while (promptMoreStudents(input, output).equalsIgnoreCase("y"));

        // using an anonymous class
        /*students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student aStudent, Student anotherStudent) {
                return aStudent.compareTo(anotherStudent);
            }
        });*/

        // using a lambda
        //students.sort((aStudent, anotherStudent) -> aStudent.compareTo(anotherStudent));

        // using natural order
        students.sort(Comparator.naturalOrder());

        for (Student student: students) {
            output.println(student.fullName() + " " + student.score());
        }
    }

    private static int promptScore(Scanner input, PrintStream output) {
        output.println("Score:");
        int score = input.nextInt();

        if (score < 0 || score > 100) {
            return promptScore(input, output);
        }

        return score;
    }

    private static String promptFirstName(Scanner input, PrintStream output) {
        output.println("First name:");
        String firstName = input.next();

        if (firstName.trim().isEmpty()) {
            return promptFirstName(input, output);
        }

        return firstName;
    }

    private static String promptLastName(Scanner input, PrintStream output) {
        output.println("Last name: ");
        String lastName = input.next();

        if (lastName.trim().isEmpty()) {
            return promptLastName(input, output);
        }

        return lastName;
    }

    private static String promptMoreStudents(Scanner input, PrintStream output) {
        output.println("Do you want to add another student");

        return input.next();
    }
}
