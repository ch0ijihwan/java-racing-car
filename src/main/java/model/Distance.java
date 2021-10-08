package model;

import java.util.Random;

public class Distance {
    private static final  Random RANDOM = new Random();

    public int makeZeroOrOneStep() {
        return RANDOM.nextInt(2);
    }
}
