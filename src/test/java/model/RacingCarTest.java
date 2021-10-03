package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class RacingCarTest {
    private RacingCar racingCar;

    @ParameterizedTest
    @CsvSource(value = {"tom,devin,kate,coco,andy"})
    @DisplayName("자동차 이름을 제대로 반환하는지 확인")
    void getCarName(String value) {
        RacingCar racingCar = new RacingCar(value);
        assertThat(racingCar.getCarName()).isEqualTo(value);
    }
}
