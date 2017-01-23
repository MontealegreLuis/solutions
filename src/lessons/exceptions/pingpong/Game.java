/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.exceptions.pingpong;

import java.io.PrintStream;

class Game {
    private PrintStream output;
    private Player player;
    private Player opponent;

    Game(PrintStream output, Player player, Player opponent) {
        this.output = output;
        this.player = player;
        this.opponent = opponent;
    }

    PrintStream showScores() {
        return output.printf(
            "Score: You: %d, Computer: %d%n",
            player.score(),
            opponent.score()
        );
    }

    void playerSwings() {
        play(player, opponent);

    }

    void opponentSwings() {
        play(opponent, player);
    }

    private void play(Player player, Player opponent) {
        TableSide swingSide = player.swingPaddle();
        TableSide ballSide = opponent.throwBall();

        output.printf(
            "Paddle was swung to the %s, ball was thrown to the %s%n",
            swingSide,
            ballSide
        );

        if (!swingSide.equals(ballSide)) opponent.increaseScore();
    }

    boolean isThereAWinner() {
        return player.hasWon() || opponent.hasWon();
    }
}
