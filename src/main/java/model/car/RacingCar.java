package model.car;

import model.vo.Distance;
import model.vo.Name;

import java.util.Objects;

public class RacingCar {
    private static final int ONE_MOVEMENT = 1;
    private final Name carName;
    private final Distance distance;

    public RacingCar(String name, int distance) {
        this.carName = new Name(name);
        this.distance = new Distance(distance);
    }

    public RacingCar(String value) {
        this(value, 0);
    }

    public void move(boolean isMove) {
        if (isMove) {
            distance.update(ONE_MOVEMENT);
        }
    }

    public int getCarDistance() {
        return this.distance.value();
    }

    public String getCarName() {
        return carName.value();
    }

    public boolean equalsDistance(RacingCar racingCar){
        return this.distance.equals(racingCar.distance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingCar racingCar = (RacingCar) o;
        return Objects.equals(carName, racingCar.carName) && Objects.equals(distance, racingCar.distance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, distance);
    }
}
