package model.car;

import model.movement.RandomMovement;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RacingCars {

    private final List<RacingCar> cars;

    public RacingCars(String[] inputPlayers) {
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
        RacingCars that = (RacingCars) o;
        return Objects.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
