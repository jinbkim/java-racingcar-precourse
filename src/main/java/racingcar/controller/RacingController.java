package racingcar.controller;

import java.util.List;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

    private InputView inputView = new InputView();

    public void run() {
        String input = inputView.requestInput(OutputView.REQUEST_CAR_NAME_LIST);
        List<String> carNameList = inputView.parseCarNameList(input);
    }
}
