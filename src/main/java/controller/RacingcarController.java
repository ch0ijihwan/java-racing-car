package controller;

import model.Racing;
import model.Referee;
import view.Input;
import view.StatusDisplay;

public class RacingcarController {
    private final Racing racing;
    private int numberOfAttempts;

    public RacingcarController() {
        StatusDisplay.showInputNams();
        this.racing = new Racing(Input.inputRacingcarNames());
        StatusDisplay.showInputNumberOfAttempts();
        this.numberOfAttempts = Input.inputFinishLine();
    }

    public void run() {
        StatusDisplay.showStartGame();
        Referee referee = new Referee(racing.getRacingCars().getCars());
        while (numberOfAttempts > 0) {
            racing.move();
            referee = new Referee(racing.getRacingCars().getCars());
            StatusDisplay.showGameStatus(racing.getRacingCars().getCars());
            numberOfAttempts --;
        }
        StatusDisplay.showEndGame(referee.winners(),referee.winners().size());
    }
}
