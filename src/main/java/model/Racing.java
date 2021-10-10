package model;

import java.util.List;

public class Racing {
    private List<RacingCar> racingCars;

    public Racing(List<RacingCar> racingCars) {
        this.racingCars = racingCars;
        moveAllRacingcars();
    }

    public List<RacingCar> moveAllRacingcars() {
        this.racingCars.forEach(RacingCar::move);
        return racingCars;
    }

    public List<RacingCar> getRacingcarRouter() {
        return racingCars;
    }
}
