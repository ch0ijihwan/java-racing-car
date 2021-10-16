package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RacingcarsTest {
    @Test
    @DisplayName("첫 입력시 선수 명단을 만들어 갯수대로 레이싱카를 만드는지 확인")
    void makePlayerRoster() {
        String[] inputPlayers = {"ass", "asd", "sdsa", "asdf"};
        assertThat(new Racingcars(inputPlayers).getCars().size())
                .isEqualTo(inputPlayers.length);
    }
}
