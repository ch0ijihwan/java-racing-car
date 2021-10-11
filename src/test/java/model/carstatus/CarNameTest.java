package model.carstatus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CarNameTest {
    private CarName carName;

    @ParameterizedTest
    @DisplayName("자동차의 이름의 길이가 5를 초과하거나 공백을 입력하는 경우 예외처리 반환")
    @CsvSource(value = {"abcde", "",})
    void getCarName(String value) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> carName = new CarName(value))
                .withMessage("이름의 길이가 0 이거나 5를 초과 했습니다.");

    }
}
