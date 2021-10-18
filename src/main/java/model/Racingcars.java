package model;

import model.movement.RandomMovement;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Racingcars {
    private final List<RacingCar> cars;

    public Racingcars(String[] inputPlayers) {
        cars = Arrays.stream(inputPlayers)
                .map(RacingCar::new)
                .collect(Collectors.toList());
    }

    public List<RacingCar> getCars() {
        return cars;
    }

    public void race() {
        cars.forEach(car -> car.move(new RandomMovement().generateMovement()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Racingcars that = (Racingcars) o;
        return Objects.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
