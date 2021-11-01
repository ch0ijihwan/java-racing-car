package util;

import java.util.Random;

public class RandomUtil {

    private static final int TWO_RANDOM_RANGES = 2;

    private RandomUtil() {

    }

    private static final Random RANDOM = new Random();

    public static int generateRandomNumber() {
        return RANDOM.nextInt(TWO_RANDOM_RANGES);
    }
}
