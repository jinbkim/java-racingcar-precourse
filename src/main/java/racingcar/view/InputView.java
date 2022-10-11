package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.car.CarsName;

public class InputView {

    public CarsName requestCarsName() {
        try {
            String input = requestInput(OutputView.REQUEST_CARS_NAME);
            return new CarsName(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return requestCarsName();
        }
    }

    public int requestTryNum() {
        String input = requestInput(OutputView.REQUEST_TRY_NUM);

        return Integer.parseInt(input);
    }

    private String requestInput(String input) {
        System.out.println(input);
        return Console.readLine();
    }

}
