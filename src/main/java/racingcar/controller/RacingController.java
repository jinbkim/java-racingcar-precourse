package racingcar.controller;

import java.util.List;
import racingcar.view.InputView;

public class RacingController {

    private InputView inputView = new InputView();

    public void run() {
        List<String> carNameList = inputView.requestCarNameList();
    }
}
