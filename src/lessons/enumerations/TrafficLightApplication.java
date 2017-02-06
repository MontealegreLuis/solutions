/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.enumerations;

import java.io.PrintStream;
import java.util.Scanner;

public class TrafficLightApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;

        output.println("Enter the traffic light color");
        TrafficLightColor color = TrafficLightColor.valueOf(
            input.next().trim().toUpperCase()
        );

        if (TrafficLightColor.GREEN.equals(color)) {
            output.println("Go ahead");
        } else if (TrafficLightColor.YELLOW.equals(color)) {
            output.println("Slow down");
        } else {
            output.println("Stop!");
        }
    }
}
