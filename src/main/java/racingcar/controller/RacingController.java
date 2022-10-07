package racingcar.controller;

import java.util.List;
import racingcar.model.CarsModel;
import racingcar.view.InputView;

public class RacingController {

    private InputView inputView = new InputView();
    private CarsModel carsModel = new CarsModel();

    public RacingController() {
    }

    public void run() {
        List<String> carNameList = inputView.requestRacingCar();
        carsModel.setCars(carNameList);

        carsModel.toString();
    }
}
