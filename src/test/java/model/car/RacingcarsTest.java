package model.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RacingcarsTest {
    @Test
    @DisplayName("첫 입력시 선수 명단을 만들어 갯수대로 레이싱카를 만드는지 확인")
    void makePlayerRoster() {
        //given
        String[] inputPlayers = {"ass", "asd", "sdsa"};

        //When
        Racingcars racingcars = new Racingcars(inputPlayers);
        List<RacingCar> actual = racingcars.getCars();
        List<RacingCar> expect = Arrays.asList(new RacingCar("ass"), new RacingCar("asd"), new RacingCar("sdsa"));

        //Then
        assertThat(actual).isEqualTo(expect);
    }
}
