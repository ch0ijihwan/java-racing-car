package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class PlayersTest {
    private Players players;
    private List<RacingCar> playerRoster = new ArrayList<>();

    @Test
    @DisplayName("선수 명단을 만들어 갯수대로 레이싱카를 만드는지 확인")
    void makePlayerRoster() {
      String [] inputPlayers = {"ass","asd","sdsa","asdf"};
      assertThat(new Players(inputPlayers).getPlayerRoster().size())
              .isEqualTo(inputPlayers.length);
    }

    @ParameterizedTest
    @CsvSource(value = {"tom,devin,kate,coco,andy"})
    @DisplayName("자동차의 이름이 5자리 이하인 경우 true를 반환하는지 확인")
    void verifyNameSize(String value) {
        assertThat(players.verifyNameSize(value)).isEqualTo(value);
    }

    @ParameterizedTest
    @CsvSource(value = {"tomss,devins,katess,cocsso,andyss"})
    @DisplayName("자동차의 이름이 5자리를 초과한 경우 예외처리를 반환하는지 확인")
    void verifyNameSize2(String value) {
        assertThatThrownBy(() -> verifyNameSize(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("");
    }

}
