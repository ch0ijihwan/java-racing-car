package model;

public class RacingCar {
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

    public int getCarRecode(){
        return record;
    }

    public String getCarName() {
        return this.carName;
    }
}
