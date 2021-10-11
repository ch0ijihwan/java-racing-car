package model.carstatus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CarDistanceTest {
    CarDistance carDistance;

    @Test
    @DisplayName("첫 객체 생성시 거리를 0으로 초기화 하는지 확인")
    void checkDistanceWhenCreate() {
        carDistance = new CarDistance();
        assertThat(carDistance.value()).isZero();
    }

    @ParameterizedTest
    @DisplayName("이동거리를 입력 받으면, 그 거리 만큼 distance를 변화시키는지 확인하는 테스트 코드")
    @CsvSource(value = {"1,2,3", "3,2,5"})
    void moveValue(int firstMovement, int secondMovement, int secondExpect) {
        carDistance = new CarDistance();

        assertAll(
                () -> {
                    carDistance.update(firstMovement);
                    assertThat(carDistance.value()).isEqualTo(firstMovement);
                },
                () -> {
                    carDistance.update(secondMovement);
                    assertThat(carDistance.value()).isEqualTo(secondExpect);
                });
    }
}
