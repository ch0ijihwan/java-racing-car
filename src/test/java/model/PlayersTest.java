package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PlayersTest {
    @ParameterizedTest
    @CsvSource(value = {"aron", "king", "sona"})
    void makeCar(String carName) {
        RacingCarTest car = new RacingCarTest(carName);
        assertThat(car.getCarName()).isEquls(carName);
    }

    @Test
    @DisplayName("선수 명단을 만들어 라스트화 하는지 확인")
    void makePlayerRoster() {
        List<RacingCarTest> playerRoster = new ArrayList<>();

        assertThat(playerRoster).isEqualTo(updatePlayerRoster());
    }

}
