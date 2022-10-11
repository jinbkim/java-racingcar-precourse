package racingcar.utils;

import java.util.List;
import java.util.regex.Pattern;
import racingcar.view.OutputView;

public class InputValidator {

    private static final int CAR_NAME_LEN_MAX = 5;

    private static String RACING_ROUND_REGEX = "^[0-9]*$";

    public void validateCarsName(List<String> carsName) {
        for (String carName : carsName) {
            if (carName.length() == 0 || carName.length() > CAR_NAME_LEN_MAX) {
                throw new IllegalArgumentException(OutputView.WRONG_CAR_NAME_LEN);
            }
        }
    }

    public void validateRacingRound(String input) {
        if (!Pattern.matches(RACING_ROUND_REGEX, input)) {
            throw new IllegalArgumentException(OutputView.WRONG_RACING_ROUND);
        }
        if (Integer.parseInt(input) == 0) {
            throw new IllegalArgumentException(OutputView.RACING_ROUND_NONE_ZERO);
        }
    }
}
