package model;

public class Racing {
    private Racingcars racingCars;

    public Racing(Racingcars racingCars) {
        this.racingCars = racingCars;
    }

    public void moveAllRacingcars() {
        racingCars = racingCars.moveCars();
    }

    public Racingcars getRacingCars() {
        return racingCars;
    }
}
