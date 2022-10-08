package racingcar.controller;

import java.util.List;
import racingcar.model.CarsModel;
import racingcar.view.InputView;

public class RacingController {

    private InputView inputView = new InputView();
    private CarsModel carsModel = new CarsModel();

    public void run() {
        List<String> carNameList = inputView.requestCarNameList();
        int tryNumber = inputView.requestTryNumber();

        carsModel.setCarList(carNameList);
        carsModel.race(tryNumber);
    }
}
