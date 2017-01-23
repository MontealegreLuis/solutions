/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.exceptions.pingpong;

import java.io.PrintStream;
import java.util.Scanner;

class HumanPlayer extends Player {
    private PrintStream output;
    private Scanner input;

    HumanPlayer(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
    }

    TableSide throwBall() {
        output.println("What side of the table do you want to throw the ball? left/right");
        return TableSide.valueOf(input.next().toUpperCase());
    }

    TableSide swingPaddle() {
        output.println("What side of the table do you want to swing the paddle? left/right");
        return TableSide.valueOf(input.next().toUpperCase());
    }
}
