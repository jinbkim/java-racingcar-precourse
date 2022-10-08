package racingcar.controller;

import racingcar.view.InputView;

public class RacingController {

    private InputView inputView = new InputView();

    public void run() {
        inputView.requestCarNameList();
        inputView.requestTryNumber();
    }
}
