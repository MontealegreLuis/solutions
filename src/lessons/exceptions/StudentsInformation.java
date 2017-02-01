package lessons.exceptions;

import java.io.PrintStream;
import java.util.Scanner;

public class StudentsInformation {
    public static void main(String[] args) {
        PrintStream output = System.out;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String[][] students = students();
        String[] selectedStudent;
        int studentNumber;

        do {
            showStudents(output, students);

            studentNumber = chooseStudent(output, input, students);
            selectedStudent = students[studentNumber - 1];

            String information = chooseInformationToShow(
                input,
                output,
                selectedStudent,
                studentNumber
            );

            showStudentInformation(output, selectedStudent, information);
        } while ("y".equalsIgnoreCase(anotherStudent(input, output)));
    }

    private static String anotherStudent(Scanner input, PrintStream output) {
        String anotherStudent;
        do {
            output.println("Do you want to continue? (y/n)");
            anotherStudent = input.next();
        } while (!"y".equalsIgnoreCase(anotherStudent) && !"n".equalsIgnoreCase(anotherStudent));
        return anotherStudent;
    }

    private static void showStudentInformation(
        PrintStream output,
        String[] selectedStudent,
        String information
    ) {
        String name = selectedStudent[0];
        if (information.equalsIgnoreCase("hometown")) {
            output.printf("%s's hometown is %s%n", name, selectedStudent[1]);
        } else {
            output.printf("%s's favorite food is %s%n", name, selectedStudent[2]);
        }
    }

    private static String chooseInformationToShow(
        Scanner input,
        PrintStream output,
        String[] student,
        int studentNumber
    ) {
        String studentName = student[0];
        String information;

        do {
            output.printf(
                "Student %d is %s. What would you like to know about %s? (Hometown or favorite food)%n",
                studentNumber,
                studentName,
                studentName
            );
            information = input.next();
        } while (!information.equalsIgnoreCase("hometown")
            && !information.equalsIgnoreCase("favorite food"));

        return information;
    }

    private static int chooseStudent(
        PrintStream output,
        Scanner input,
        String[][] students
    ) {
        int studentNumber;
        do {
            output.println("Which student would you like to learn more about?");
            output.println("Enter a number between 1 and " +  students.length);
            studentNumber = input.nextInt();
        } while (1 > studentNumber || studentNumber > students.length );
        return studentNumber;
    }

    private static void showStudents(PrintStream output, String[][] students) {
        output.println("These are our students");
        for (int i = 0; i < students.length; i++) {
            output.println((i + 1) + ") " + students[i][0]);
        }
    }

    private static String[][] students() {
        return new String[][]{
            { "Gerrae", "Detroit", "Pizza" },
            { "Valerie", "Wisconsin", "Cake" },
            { "Latresha", "Flint", "Seafood" },
            { "Blair", "Troy", "Sushi" },
            { "Karen", "Ferndale", "Mexican" },
            { "Shruti", "Auburn Hills", "Indian" },
            { "Lily", "Commerce Township", "Steak" },
            { "Laurin", "Rochester Hills", "Sushi" },
            { "Kristen", "Sterling Heights", "Pizza" },
            { "Abbi", "East Lansing", "Pizza" },
            { "Tommy", "Southfield", "Chinese" },
            { "Ambyr", "Redford", "Coffee" },
            { "Amy", "Lapeer", "Seafood" },
            { "Jamila", "Chicago", "Crablegs" },
            { "DeeAnn", "Chicago", "Fettuccine Alfredo" },
            { "Vonnita", "Southfield", "Pizza as well as Chicken Pot Pies" },
            { "Tracy", "Holly", "Thai" },
            { "Noor", "will find out", "will found out" },
            { "Janna", "North Branch", "Watermelon & Steak" },
            { "Grace", "Fenton", "French Fries" }
        };
    }
}
