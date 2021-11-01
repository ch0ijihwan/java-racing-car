package model.vo;

import java.util.Objects;

public class Name {
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private final String carName;

    public Name(String carName) {
        verifyNameSize(carName);
        this.carName = carName;
    }

    private void verifyNameSize(String value) {
        if (value.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("이름의 길이가 5를 초과 했습니다.");
        }
    }

    public String value() {
        return carName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(carName, name.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }
}
