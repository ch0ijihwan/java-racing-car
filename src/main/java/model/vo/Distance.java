package model.vo;

import java.util.Objects;

public class Distance {
    private static final int NOT_MOVE = 0;
    private int value;
    private boolean moving;

    public Distance() {
        this.value = NOT_MOVE;
        moving = false;
    }

    public Distance(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public void update(int movement) {
        value = value + movement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distance distance = (Distance) o;
        return value == distance.value && moving == distance.moving;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, moving);
    }
}
