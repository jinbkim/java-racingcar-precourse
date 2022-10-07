package racingcar.controller;

import java.util.List;
import racingcar.model.CarsModel;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

    private InputView inputView = new InputView();
    private CarsModel carsModel = new CarsModel();

    public RacingController() {
    }

    public void run() {
        List<String> carNameList = inputView.requestRacingCar();
        int raceTryNumber = inputView.requestRaceTryNumber();

        carsModel.setCars(carNameList);
        System.out.println(OutputView.RESULT);
        for (int i = 0; i < raceTryNumber; i++) {
            carsModel.race();
        }

        carsModel.toString();
    }
}
