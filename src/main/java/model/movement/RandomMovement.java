package model.movement;

import java.util.Random;

public class RandomMovement implements MovementStrategy {
    private final Random RANDOM = new Random();

    @Override
    public boolean generateMovement() {
        return RANDOM.nextBoolean();
    }
}

