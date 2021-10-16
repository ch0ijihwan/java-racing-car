package model.vo;

import java.util.Objects;

public class Name {
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private static final int MIN_CAR_NAME_LENGTH = 0;
    String carName;

    public Name(String carName) {
        verifyNameSize(carName);
        isBlank(carName);
        this.carName = carName;
    }

    public String value() {
        return carName;
    }

    private void verifyNameSize(String value) {
        if (value.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("이름의 길이가 5를 초과 했습니다.");
        }
    }

    private void isBlank(String value) {
        if (value.length() == MIN_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("이름의 길이가 0입니다.");
        }
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
