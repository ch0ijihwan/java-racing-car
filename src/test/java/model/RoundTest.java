package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RoundTest {
    Round round;

    @ParameterizedTest
    @MethodSource("racingCarPlayersRosterProvideParameter")
    @DisplayName("RacingCar 리스트에서 승자가 있는 경우 승자의 이름을 반환하는 함수.")
    void getCheckWinner(List<RacingCar> racingCars, int finishLine ,String [] expect) {
        round = new Round(racingCars, finishLine);
        round.checkWinner();
        assertThat(round.getWinner()).isEqualTo(expect);
    }

    static Stream<Arguments> racingCarPlayersRosterProvideParameter() {
        return Stream.of(
                arguments(Arrays.asList(
                        new RacingCar("first", 1),
                        new RacingCar("second", 3),
                        new RacingCar("third", 10)), 10, new String[]{"third"}),
                arguments(Arrays.asList(
                        new RacingCar("first", 3),
                        new RacingCar("second", 10),
                        new RacingCar("third", 2)), 10, new String[]{"second"}),
                arguments(Arrays.asList(
                        new RacingCar("first", 10),
                        new RacingCar("second", 5),
                        new RacingCar("third", 2)), 10, new String[]{"first"}),
                arguments(Arrays.asList(
                        new RacingCar("first", 14),
                        new RacingCar("second", 32),
                        new RacingCar("third", 100)), 100, new String[]{"third"}),
                arguments(Arrays.asList(
                        new RacingCar("first", 33),
                        new RacingCar("second", 20),
                        new RacingCar("third", 100)), 100, new String[]{"second"}),
                arguments(Arrays.asList(
                        new RacingCar("first", 100),
                        new RacingCar("second", 25),
                        new RacingCar("third", 23)), 100, new String[]{"first"}
                ),
                arguments(Arrays.asList(
                        new RacingCar("first", 10),
                        new RacingCar("second", 10),
                        new RacingCar("third", 23)), 10, new String[]{"first","second"}
                )
        );

    }
}
