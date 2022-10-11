package racingcar.utils;

import java.util.List;
import racingcar.view.OutputView;

public class InputValidator {

    private static final int CAR_NAME_LEN_MAX = 5;

    public void validateCarsName(List<String> carsName) {
        for (String carName : carsName) {
            if (carName.length() == 0 || carName.length() > CAR_NAME_LEN_MAX) {
                throw new IllegalArgumentException(OutputView.WRONG_CAR_NAME_LEN);
            }
        }
    }
}
