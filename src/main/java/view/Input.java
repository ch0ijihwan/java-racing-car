package view;

import java.util.Scanner;

public class Input {
    private static final Scanner SCANNER = new Scanner(System.in);

    private Input() {
    }

    public static String[] inputRacingcarNames() {
        return SCANNER.next()
                .split(",");
    }

    public static int inputNumberAttempts() {
        return SCANNER.nextInt();
    }
}
