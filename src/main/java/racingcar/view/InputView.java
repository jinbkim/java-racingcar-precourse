package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.RacingRound;
import racingcar.model.car.CarsName;

public class InputView {

    public CarsName requestCarsName() {
        String input = requestInput(OutputView.REQUEST_CARS_NAME);

        try {
            return new CarsName(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return requestCarsName();
        }
    }

    public RacingRound requestRacingRound() {
        String input = requestInput(OutputView.REQUEST_RACING_ROUND);

        try {
            return new RacingRound(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return requestRacingRound();
        }
    }

    private String requestInput(String input) {
        System.out.println(input);
        return Console.readLine();
    }

}
