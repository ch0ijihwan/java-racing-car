package model;

import model.movement.RandomMovement;

import java.util.Arrays;
import java.util.List;
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
}
