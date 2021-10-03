package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class RacingCarTest {
    private RecordTest record = new RecordTest();
    private String carName;
    private RacingCarTest racingCar;

    @ParameterizedTest
    @CsvSource(value = {"tom,devin,kate,coco,andy"})
    @DisplayName("자동차 이름을 제대로 반환하는지 확인")
    void getCarName(String value){
        racingCar = new RacingCarTest(value);
        assertThat(racingCar.getCarName()).isEqulTo(value);
       
    }
    
    @Test
    @DisplayName("자동차의 이름이 5자리 이하인 경우  true를 반환하는지 확인")
    void verifyNameSize() {
       assertThat(carName.verifyNameSize()).isTrue();
    }

    @Test
    @DisplayName("자동차의 이름이 5자리를 초과한 경우 예외처리를 반환하는지 확인"){
        assertThatThrownBy(() -> carName.verifyNameSize())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("");
    }
}
