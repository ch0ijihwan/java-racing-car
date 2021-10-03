package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class RacingCar {
    private Record record = new Record();
    private String carName;

    @Test
    @DisplayName("플레이어의 자동차의 이름이 5자리 이하인 경우  true를 반환하는지 확인")
    void verifyNameSize() {
       assertThat(carName.verifyNameSize()).isTrue();
    }

    @Test
    @DisplayName("플레이어의 자동차의 이름이 5자리를 초과한 경우 예외처리를 반환하는지 확인"){
        assertThatThrownBy(() -> carName.verifyNameSize())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("");
    }
}
