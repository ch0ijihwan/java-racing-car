package model.movement;

import java.util.Random;

public class RandomMovement implements MovementStrategy {
    private static final int TWO_RANDOM_RANGES = 2;
    private static final Random RANDOM = new Random();

    @Override
    public int makeZeroOrOneStep() {
        return RANDOM.nextInt(TWO_RANDOM_RANGES);
    }
}

