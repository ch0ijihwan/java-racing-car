package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RacingTest {
    Racing racing;
    Players players;

    @Test
    @DisplayName("Round객체 생성시 자동차가 움직이는지 확인.")
    void checkMove() {
    }

    @Test
    @DisplayName("레이싱도중 선수 명단을 불러올 때, 기존의 선수 명단을 반환하는지 확인(간접적으로 반환되는 자동차의 개수가 같은지 확인)")
    void getRaicincarRoster() {
        String[] names = new String[]{"Kim", "Choi", "Yee"};
        players = new Players(names);
        racing = new Racing(players.getPlayerRoster());

        assertThat(racing.getRacingcarRouter().size())
                .isEqualTo(names.length);
    }
}
