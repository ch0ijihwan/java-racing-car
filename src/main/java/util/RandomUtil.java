package util;

import java.util.Random;

public class RandomUtil {
    private static final Random RANDOM = new Random();
    public static int generateRandomNumber(){
        return RANDOM.nextInt(2);
    }
}
