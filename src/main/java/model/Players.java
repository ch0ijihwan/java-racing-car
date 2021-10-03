package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Players {
    private String[] playersNames;
    private List<RacingCar> playerRoster = new ArrayList<>();

    public Players(String[] inputPlayers) {
        playerRoster = Arrays.stream(inputPlayers)
                .map(RacingCar::new)
                .collect(Collectors.toList());
    }

    public List<RacingCar> getPlayerRoster() {
        return playerRoster;
    }

    public String verifyNameSize(String value) {
        if (value.length() <= 5)
            return value;
        throw new IllegalStateException("입력된 이름의 길이가 5보다 깁니다.");
    }
}
