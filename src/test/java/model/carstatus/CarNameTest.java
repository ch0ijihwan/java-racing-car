package model.carstatus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {
    private CarName carName;

    @ParameterizedTest
    @DisplayName("자동차의 이름의 길이가 5를 초과하거나 공백을 입력하는 경우 예외처리 반환")
    @CsvSource(value = {"abcdef"})
    void getCarName(String value) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new CarName(value))
                .withMessage("이름의 길이가 5를 초과 했습니다.");

    }

    @Test
    @DisplayName("길이가 0인 값이 넘어올 경우 예외처리 반환")
    void blankTest()
    {        String value = "";
        assertThatThrownBy(() -> new CarName(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름의 길이가 0입니다.");
    }
}
