package model;

import java.util.Objects;

public class RacingCar {//TODO 두번째 생성자 삭제 고려
    private final String carName;
    private int record;

    public RacingCar(String value) {
        this.carName = value;
        this.record = 0;
    }

    public RacingCar(String value, int record) {
        this.carName = value;
        this.record = 0;
    }

    public void move(){
        this.record = this.record + Distance.makeZeroOrOneStep();
    }

    public int getCarRecode(){
        return this.record;
    }

    public String getCarName() {
        return this.carName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingCar racingCar = (RacingCar) o;
        return Objects.equals(carName, racingCar.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, record);
    }
}
