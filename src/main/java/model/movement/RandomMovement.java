package model.movement;

import java.util.Random;

public class RandomMovement implements MovementStrategy {
    private static final Random RANDOM = new Random();

    @Override
    public Boolean generateMovement() {
        return RANDOM.nextBoolean();
    }
}

