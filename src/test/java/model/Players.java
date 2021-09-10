package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Players {
    @ParameterizedTest
    @CsvSource(value = {"aron", "king", "sona"})
    void makeCar(String carName) {
        RacingCar car = new RacingCar(carName);
        assertThat(car.getCarName()).isEquls(carName);
    }

    @Test
    @DisplayName("선수 명단을 만들어 라스트화 하는지 확인")
    void makePlayerRoster() {
        List<RacingCar> playerRoster = new ArrayList<>();

        assertThat(playerRoster).isEqualTo(updatePlayerRoster());
    }

}
