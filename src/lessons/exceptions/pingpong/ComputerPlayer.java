/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.exceptions.pingpong;

import java.util.Random;

class ComputerPlayer extends Player {
    private Random random;

    ComputerPlayer(Random random) {
        this.random = random;
    }

    @Override
    TableSide throwBall() {
        return TableSide.fromOrdinal(random.nextInt(2));
    }

    @Override
    TableSide swingPaddle() {
        return TableSide.fromOrdinal(random.nextInt(2));
    }
}
