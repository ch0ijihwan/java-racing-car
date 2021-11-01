package model.vo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class NameTest {
    @ParameterizedTest
    @DisplayName("자동차의 이름의 길이가 5를 초과하거나 공백을 입력하는 경우 예외처리 반환")
    @CsvSource(value = {"abcdef"})
    void getCarName(String value) {
        //Then
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Name(value))
                .withMessage("이름의 길이가 5를 초과 했습니다.");

    }

    @ParameterizedTest
    @CsvSource(value = {"tom,tom", "cici,cici", "a,a"})
    @DisplayName("자동차 이름을 반환하는지 확인하는 테스트")
    void getCarName(String Name, String expect) {
        //given
        Name name = new Name(Name);

        //when
        String actual = name.value();

        //Then
        assertThat(actual).isEqualTo(expect);
    }
}
