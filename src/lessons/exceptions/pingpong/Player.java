/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.exceptions.pingpong;

abstract class Player {
    private static final int MAX_SCORE = 7;
    private int score = 0;

    abstract TableSide throwBall();

    abstract TableSide swingPaddle();

    int score() {
        return score;
    }

    void increaseScore() {
        score++;
    }

    boolean hasWon() {
        return score == MAX_SCORE;
    }
}
