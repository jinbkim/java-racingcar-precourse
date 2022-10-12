package racingcar.controller;

import racingcar.model.RacingRound;
import racingcar.model.car.Cars;
import racingcar.model.car.CarsName;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

    private final InputView inputView = new InputView();

    public void run() {
        CarsName carsName = inputView.requestCarsName();
        Cars cars = new Cars(carsName);
        RacingRound racingRound = inputView.requestRacingRound();

        System.out.println(OutputView.RESULT);
        while (!racingRound.isGameOver()) {
            cars.race();
        }
        cars.printWinner();
    }
}
