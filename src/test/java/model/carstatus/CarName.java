package model.carstatus;

import model.RacingCar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarName {
    @ParameterizedTest
    @DisplayName("자동차의 이름의 길이가 5를 초과하는 경우 예외처리 반환")
    @CsvSource(value = {"tom", "devin", "kate", "coco", "andy"})
    void getCarName(String value) {
        RacingCar racingCar = new RacingCar(value);
        assertThat(racingCar.getCarName()).isEqualTo(value);
    }
}
