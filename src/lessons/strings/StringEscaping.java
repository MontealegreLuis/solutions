/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.strings;

public class StringEscaping {
    public static void main(String[] args) {
        String message;

        // There's no need to escape single quotes.
        message = "We don't need no education";
        System.out.println(message);

        message = "We don't need no thought control";
        System.out.println(message);

        // We do need to escape double quotes.
        message = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(message);

        // Backslashes need to be escaped too.
        message = "In windows, the main drive is usually C:\\";
        System.out.println(message);

        message = "I can do back slashes \\, and double back slashes \\\\, and the amazing triple back-slash \\\\\\!";
        System.out.println(message);
    }
}
