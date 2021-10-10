package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

class PlayersTest {
    private Players players;
    private Players changedPlayers;

    @Test
    @DisplayName("각 선수에 대한 변경된 선수 정보 명단 객체를 받을 시,  선수 명단을 업데이트 하는지 확인.")
    void checkUpdatePlayerRoster() {
        String[] inputPlayers = {"a", "b", "c", "d"};

        players = new Players(inputPlayers);
        changedPlayers = new Players(players);

        assertThat(changedPlayers).isEqualTo(players);
    }

    @Test
    @DisplayName("첫 입력시 선수 명단을 만들어 갯수대로 레이싱카를 만드는지 확인")
    void makePlayerRoster() {
        String[] inputPlayers = {"ass", "asd", "sdsa", "asdf"};
        assertThat(new Players(inputPlayers).getPlayerRoster().size())
                .isEqualTo(inputPlayers.length);
    }

    @ParameterizedTest
    @CsvSource(value = {"tomsss", "devins", "katess", "cocsso", "andyss"})
    @DisplayName("자동차의 이름이 5자리를 초과한 경우 예외처리를 반환하는지 확인")
    void verifyNameSize2(String value) {
        String[] tokens = value.split(",");
        assertThatIllegalStateException()
                .isThrownBy(() -> players = new Players(tokens))
                .withMessage("입력된 이름의 길이가 5보다 깁니다.");
    }
}
