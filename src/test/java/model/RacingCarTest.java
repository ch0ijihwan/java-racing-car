package model;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class RacingCarTest {
    private RacingCar racingCar;

    @ParameterizedTest
    @CsvSource(value = {"tom,devin,kate,coco,andy"})
    @DisplayName("자동차 이름을 제대로 반환하는지 확인")
    void getCarName(String value) {
        RacingCar racingCar = new RacingCar(value);
        assertThat(racingCar.getCarName()).isEqualTo(value);
    }

    @ParameterizedTest
    @CsvSource(value = {"tom,devin,kate,coco,andy"})
    @DisplayName("자동차의 이름이 5자리 이하인 경우 true를 반환하는지 확인")
    void verifyNameSize(String value) {
        racingCar = new RacingCar(value);
        assertThat(racingCar.verifyNameSize()).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"tomss,devins,katess,cocsso,andyss"})
    @DisplayName("자동차의 이름이 5자리를 초과한 경우 예외처리를 반환하는지 확인")
    void verifyNameSize2(String value) {
        racingCar = new RacingCar(value);
        assertThatThrownBy(() -> racingCar.verifyNameSize())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("");
    }

    @ParameterizedTest
    @CsvSource(value = {"aron", "king", "sona"})
    void makeCar(String carName) {
        RacingCar car = new RacingCar(carName);
        AssertionsForClassTypes.assertThat(car.getCarName()).isEqualTo(carName);
    }
}
