package model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Players {
    private final List<RacingCar> playerRoster;

    public Players(String[] inputPlayers) {
        Arrays.stream(inputPlayers)
                .forEach(Players::verifyNameSize);

        playerRoster = Arrays.stream(inputPlayers)
                .map(RacingCar::new)
                .collect(Collectors.toList());
    }

    public List<RacingCar> getPlayerRoster() {
        return playerRoster;
    }

    public static boolean verifyNameSize(String value) {
        if (value.length() <= 5)
            return true;
        throw new IllegalStateException("입력된 이름의 길이가 5보다 깁니다.");
    }
}
