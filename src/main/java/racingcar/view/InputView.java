package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String requestCarsName() {
        return requestInput(OutputView.REQUEST_CARS_NAME);
    }

    private String requestInput(String input) {
        System.out.print(input);
        return Console.readLine();
    }

}
