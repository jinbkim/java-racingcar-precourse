package racingcar.controller;

import racingcar.model.CarsModel;
import racingcar.view.InputView;

public class RacingController {

    private InputView inputView = new InputView();
    private CarsModel carsModel = new CarsModel();

    public RacingController() {
    }

    public void run() {
        String racingCarInput = inputView.requestRacingCar();
        carsModel.setCars(racingCarInput);

        carsModel.toString();
    }
}
