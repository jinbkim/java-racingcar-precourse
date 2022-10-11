package racingcar.controller;

import racingcar.view.InputView;

public class RacingController {

    private final InputView inputView = new InputView();

    public void run() {
        inputView.requestCarsName();
    }
}
