package util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomUtilTest {
    @Test
    @DisplayName("0 혹은 1인 랜덤 수를 반환하는지 확인")
    void generateRandom() {
        assertThat(RandomUtil.generateRandomNumber()).isNotNegative().isLessThan(2);
    }
}