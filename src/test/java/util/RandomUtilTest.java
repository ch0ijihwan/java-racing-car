package util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static util.RandomUtil.generateRandomNumber;

class RandomUtilTest {
    private static final int TWO_RANDOM_RANGES = 2;

    @ParameterizedTest
    @MethodSource("randomUtilParameterProvider")
    @DisplayName("0 혹은 1인 랜덤 수를 반환하는지 확인")
    void generateRandom() {
        assertThat(generateRandomNumber()).isNotNegative().isLessThan(TWO_RANDOM_RANGES);
    }

    static Stream<Arguments> randomUtilParameterProvider() {
        return Stream.of(
                arguments(generateRandomNumber()),
                arguments(generateRandomNumber()),
                arguments(generateRandomNumber()),
                arguments(generateRandomNumber()),
                arguments(generateRandomNumber()),
                arguments(generateRandomNumber()),
                arguments(generateRandomNumber()),
                arguments(generateRandomNumber()),
                arguments(generateRandomNumber()),
                arguments(generateRandomNumber()),
                arguments(generateRandomNumber()),
                arguments(generateRandomNumber()));
    }
}