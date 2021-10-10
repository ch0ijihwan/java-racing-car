package model;

import java.util.ArrayList;
import java.util.List;

public class Racing {
    private String[] winnersNames;
    private final List<RacingCar> racingCars = new ArrayList<>();
    public Boolean isExistWinners;

    public Racing(List<RacingCar> racingCars) {
        moveAllRacingcars();
    }

    public List<RacingCar> moveAllRacingcars() {
        this.racingCars.forEach(RacingCar::move);
        return racingCars;
    }

    public String[] getWinner() {
        return winnersNames;
    }
}
