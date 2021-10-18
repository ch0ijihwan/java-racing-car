package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RacingTest {

    @Test
    @DisplayName("getRacingcars 호출 시, 인풋으로 받았던 Racincars를 반환한다.")
    void create() {
        //given
        String[] inputNames = new String[]{"a", "b", "c"};
        Racing racing = new Racing(inputNames);
        Racingcars expect = new Racingcars(inputNames);

        //when
        Racingcars actual = racing.getRacingCars();

        //then
        assertThat(actual).isEqualTo(expect);
    }
}
