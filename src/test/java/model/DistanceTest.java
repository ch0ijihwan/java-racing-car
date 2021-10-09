package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DistanceTest {

    @Test
    @DisplayName("랜덤으로 거리를 반환하는지 확인. 이때 거리는 0과 1만 반환 한다.")
    void generateRandomDistance() {
        assertThat(Distance.makeZeroOrOneStep()).isNotNegative().isLessThan(2);
    }
}
