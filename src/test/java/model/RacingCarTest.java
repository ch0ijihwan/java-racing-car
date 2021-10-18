package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class RacingCarTest {
    private RacingCar racingCar;

    @Test
    @DisplayName("객체 생성시, 입력 받은 인수로 Name과 Disttance 생성하는지 확인한다.")
    void inputNameAndDistace() {
        //given
        String inputName = "coco";
        String expectName = "coco";
        int inputDistance = 3;
        int expectDistance = 3;

        //when
        racingCar = new RacingCar(inputName, inputDistance);
        String actualCarName = racingCar.getCarName();
        int actualCarDistance = racingCar.getCarRecode();

        //then
        assertAll(
                () -> assertThat(actualCarName).isEqualTo(expectName),
                () -> assertThat(actualCarDistance).isEqualTo(expectDistance)
        );
    }

    @Test
    @DisplayName("두 RaicingCar가 가진 Distance(거리)를 비교하여, 값이 같은경우 true을 반환한디.")
    void equalsCarDistance() {
        //given
        racingCar = new RacingCar("a", 1);
        RacingCar anotherRacingcar = new RacingCar("b", 1);

        //when
        Boolean actual = racingCar.equalsDistance(anotherRacingcar);

        //then
        assertThat(actual).isTrue();
    }

    @Test
    @DisplayName("move 호출시 파라미터로 부터 true을 받으면 distacne의 update를 호출함을 확인한다.")
    void move() {
        //given
        racingCar = new RacingCar("a", 1);
        int expectDistance = 2;

        //when
         racingCar.move(true);
         int actualDistance = racingCar.getCarRecode();
        //then
        assertThat(actualDistance).isEqualTo(expectDistance);
    }
}
