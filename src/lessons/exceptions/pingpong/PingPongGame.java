/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.exceptions.pingpong;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class PingPongGame {
    public static void main(String[] args) {
        PrintStream output = System.out;
        HumanPlayer humanPlayer = new HumanPlayer(new Scanner(System.in), output);
        ComputerPlayer computerPlayer = new ComputerPlayer(new Random());
        Game game = new Game(output, humanPlayer, computerPlayer);

        do {
            game.playerSwings();
            game.showScores();
            if (game.isThereAWinner()) break;

            game.opponentSwings();
            game.showScores();
        } while (!game.isThereAWinner());
    }
}
