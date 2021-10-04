package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

class PlayersTest {
    private Players players;

    @Test
    @DisplayName("선수 명단을 만들어 갯수대로 레이싱카를 만드는지 확인")
    void makePlayerRoster() {
      String [] inputPlayers = {"ass","asd","sdsa","asdf"};
      assertThat(new Players(inputPlayers).getPlayerRoster().size())
              .isEqualTo(inputPlayers.length);
    }

    @ParameterizedTest
    @CsvSource(value = {"tom","devin","kate","coco","andy"})
    @DisplayName("자동차의 이름이 5자리 이하인 경우 true를 반환하는지 확인")
    void verifyNameSize(String value) {
       assertThat(Players.verifyNameSize(value)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"tomsss","devins","katess","cocsso","andyss"})
    @DisplayName("자동차의 이름이 5자리를 초과한 경우 예외처리를 반환하는지 확인")
    void verifyNameSize2(String value) {
        assertThatIllegalStateException()
                .isThrownBy(() -> verifyNameSize(value))
                .withMessage("입력된 이름의 길이가 5보다 깁니다.");
    }
}
