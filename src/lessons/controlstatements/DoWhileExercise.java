/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.controlstatements;

public class DoWhileExercise {
    public static void main(String[] args) {
        // Highlight the concept of counter
        long counter; // We'll need a long for the las exercise 1,000,000 is a big integer
        int increment; // The increment may vary when using counters
        int limit;

        // I like to use variables on this one because you can highlight the fact
        // that the process is almost the same, the condition changes slightly if
        // you're counting backwards
        // Therefore you can extract this logic into a function
        // count(counter, increment, limit)

        // Count by 2's starting with 0 and ending at 100
        counter = 0;
        increment = 2;
        limit = 100;
        do  {
            System.out.println(counter);
            counter += increment;
        } while (counter <= limit);

        // Count backwards by 5's from 100 to -10
        counter = 100;
        increment = -5;
        limit = -10;
        do {
            System.out.println(counter);
            counter += increment;
        } while (counter >= limit);

        // starts at 2, and displays the number squared on each line while the
        // number is less than 1,000,000
        counter = 2;
        limit = 1000000;
        do {
            System.out.println(counter);
            counter = counter * counter; // this one is an accumulator, not a counter
        } while (counter <= limit);
    }
}
