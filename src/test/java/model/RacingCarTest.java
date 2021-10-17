package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class RacingCarTest {
    private RacingCar racingCar;

    @Test
    @DisplayName("객체 생성 시, 이름 하나만 입력 받을 때, 입력 받은 스트링으로 Name객체, 0으로 Distance 객체를 생성하는지 확인한다.")
    void inputOnlyName() {
        //given
        String inputName = "coco";

        //when
        racingCar = new RacingCar(inputName);
        String actualCarName = racingCar.getCarName();
        String expectName = "coco";
        int actualCarDistance = racingCar.getCarRecode();
        int expectDistance = 0;

        //then
        assertAll(
                ()->assertThat(actualCarName).isEqualTo(expectName),
                () -> assertThat(actualCarDistance).isEqualTo(expectDistance)
        );
    }

    @Test
    @DisplayName("객체 생성시, 이름과 거리 둘다 입력 받았을 때, 입력 받은 인수로 Disttance 객체를 생성하는지 확인한다.")
    void inputNameAndDistace()
    {
        //given
        String inputName = "coco";
        int inputDistance = 3;

        //when
        racingCar = new RacingCar(inputName, inputDistance);
        String actualCarName = racingCar.getCarName();
        String expectName = "coco";
        int actualCarDistance = racingCar.getCarRecode();
        int expectDistance = 3;

        //then
        assertAll(
                ()->assertThat(actualCarName).isEqualTo(expectName),
                () -> assertThat(actualCarDistance).isEqualTo(expectDistance)
        );
    }

    @Test
    @DisplayName("두 RaicingCar가 가진 Distance(거리)를 비교하여, 값이 같은경우 true을 반환한디.")
    void equalsCarDistance()
    {
        //given
        RacingCar racingCar = new RacingCar("a",1);
        RacingCar anotherRacingcar = new RacingCar("b",1);

        //when
        Boolean actual = racingCar.equalsDistance(anotherRacingcar);

        //then
        assertThat(actual).isTrue();
    }
}
