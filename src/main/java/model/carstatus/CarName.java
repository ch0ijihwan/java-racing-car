package model.carstatus;

public class CarName {
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private static final int MIN_CAR_NAME_LENGTH = 0;
    String carName;

    public CarName(String carName){
        verifyNameSize(carName);
        carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    private void verifyNameSize(String value) {
        if (value.length() > MAX_CAR_NAME_LENGTH || value.length()==MIN_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("이름의 길이가 5를 초과 했습니다.");
        }
    }
}
