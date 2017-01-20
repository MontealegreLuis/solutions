/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.methods;

public class Arithmetic {
    public static void main(String[] args) {
        double number1 = 3;
        double number2 = 12;

        System.out.println(add(number1, number2));
        System.out.println(subtract(number1, number2));
        System.out.println(multiply(number1, number2));
        System.out.println(divide(number1, number2));
        System.out.println(modulus(number1, number2));
    }

    private static double modulus(double number1, double number2) {
        return number1 % number2;
    }

    private static double divide(double number1, double number2) {
        return number1 / number2;
    }

    private static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    private static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    private static double add(double number1, double number2) {
        return number1 + number2;
    }
}
