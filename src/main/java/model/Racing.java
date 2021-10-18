package model;

public class Racing {
    private final Racingcars racingCars;

    public Racing(String[] names) {
        this.racingCars = new Racingcars(names);
    }

    public Racingcars getRacingCars() {
        return racingCars;
    }

    public void move(){
        racingCars.race();
    }
}
