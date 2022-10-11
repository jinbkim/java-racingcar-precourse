package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.car.CarsName;

public class InputView {

    public CarsName requestCarsName() {
        try {
            String input = requestInput(OutputView.REQUEST_CARS_NAME);
            return new CarsName(input);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return requestCarsName();
        }
    }

    private String requestInput(String input) {
        System.out.print(input);
        return Console.readLine();
    }

}
