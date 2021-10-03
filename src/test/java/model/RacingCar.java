package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RacingCar {
    @Test
    @DisplayName("플레이어의 자동차의 이름이 5 이하 인지 확인")
    void verifyNameSize() {
        boolean result = RacingCar.verifySize();
        assertThat(result).isTrue();
        //ㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁ
    }
}
