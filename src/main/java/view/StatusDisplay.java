package view;

import model.RacingCar;

import java.util.List;
import java.util.stream.IntStream;

public class StatusDisplay {
    private StatusDisplay() {
    }

    public static void showInputNams() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표( , ) 기준으로 구분).");
    }

    public static void showInputNumberOfAttempts() {
        System.out.println("총 시도할 횟수를 입력하세요");
    }

    public static void showStartGame() {
        System.out.println("실행 결과");
    }

    public static void showGameStatus(List<RacingCar> racingCars) {
        IntStream.range(0, racingCars.size())
                .forEach(index -> System.out.println(racingCars.get(index).getCarName() + " : "
                        + "- ".repeat(racingCars.get(index).getCarRecode())));
        System.out.println();

    }

    public static void showEndGame(List<RacingCar> winners, int winnersCount) {
        System.out.print("최종 우승자는  ");
        if (winnersCount == 1) {
            System.out.print(winners.get(0).getCarName()
            );
        }
        if (winnersCount > 1) {
            IntStream.range(0, winners.size())
                    .forEach(index -> System.out.print(winners.get(index).getCarName() + ","
                    ));
        }
        System.out.print(" 입니다.");
    }
}