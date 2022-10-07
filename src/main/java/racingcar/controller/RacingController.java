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
        int tryNumber = inputView.requestTryNumber();

        carsModel.setCars(carNameList);

        carsModel.toString();
        System.out.println(tryNumber);
    }
}
