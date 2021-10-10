package model;

import java.util.ArrayList;
import java.util.List;

public class Racing {
    private final List<RacingCar> racingCars = new ArrayList<>();

    public Racing(List<RacingCar> racingCars) {
        moveAllRacingcars();
    }

    public List<RacingCar> moveAllRacingcars() {
        this.racingCars.forEach(RacingCar::move);
        return racingCars;
    }

    public List<RacingCar> getRacingcarRouter() {
        return this.racingCars;
    }
}
