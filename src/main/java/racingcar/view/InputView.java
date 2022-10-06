package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public InputView() {
    }

    public String requestRacingCar() {
        System.out.println(OutputView.RACING_CAR_INPUT);
        String input = Console.readLine();
        return input;
    }
}
