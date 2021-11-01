package model;

import model.car.RacingCar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RefereeTest {
    @Test
    @DisplayName(" winners 실행 시 racingcars 중, Distance를 기준으로 승자를 뽑아 리스트 형태로 반환한다." +
            "이때 승자가 복수인 경우도 포함하여 반환한다.")
    void winnners() {
        //given
        Referee referee = new Referee(Arrays.asList(
                new RacingCar("a", 1),
                new RacingCar("b", 2),
                new RacingCar("c", 2)));
        List<RacingCar> expect = Arrays.asList(new RacingCar("b", 2), new RacingCar("c", 2));

        //when
        List<RacingCar> actual = referee.winners();

        //then
        assertThat(actual).isEqualTo(expect);
    }
}
