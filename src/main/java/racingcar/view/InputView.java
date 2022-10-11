package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.car.CarsName;

public class InputView {

    public void requestCarsName() {
        try {
            String input = requestInput(OutputView.REQUEST_CARS_NAME);
            CarsName carsName = new CarsName(input);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            requestCarsName();
        }
    }

    private String requestInput(String input) {
        System.out.print(input);
        return Console.readLine();
    }

}
