package model.vo;

import java.util.Objects;

public class Distance {
    private int value;

    public Distance() {
        this.value = 0;
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
        return value == distance.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
