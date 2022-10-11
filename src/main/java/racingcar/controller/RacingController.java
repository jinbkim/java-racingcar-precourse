package racingcar.controller;

import racingcar.model.car.CarsName;
import racingcar.view.InputView;

public class RacingController {

    private final InputView inputView = new InputView();

    public void run() {
        String input = inputView.requestCarsName();
        CarsName carsName = new CarsName(input);
    }
}
