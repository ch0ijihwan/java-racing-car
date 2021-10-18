package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Referee {
    private final List<RacingCar> racingcars;

    public Referee(List<RacingCar> racingCars) {
        racingcars = racingCars;
    }

    public List<RacingCar> winners() {
        return new ArrayList<>(checkOverlapMaxDistance());
    }

    private List<RacingCar> checkOverlapMaxDistance() {
        RacingCar topCar = findTopRacingcar();
        return racingcars
                .stream()
                .filter(topCar::equalsDistance)
                .collect(Collectors.toList());
    }

    private RacingCar findTopRacingcar() {
        List<RacingCar> winners = sortCars(racingcars);
        return winners.get(winners.size() - 1);
    }

    private List<RacingCar> sortCars(List<RacingCar> racingCars) {
        return racingCars.stream()
                .sorted(Comparator.comparing(RacingCar::getCarRecode))
                .collect(Collectors.toUnmodifiableList());
    }
}