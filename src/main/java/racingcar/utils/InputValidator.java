package racingcar.utils;

import java.util.List;
import racingcar.view.OutputView;

public class InputValidator {

    private static final int CAR_NAME_MAX_SIZE = 5;

    public InputValidator() {
    }

    public void isValidateCarNameList(List<String> carNameList) {
        if (isCarNameDuplicate(carNameList)) {
            throw new IllegalArgumentException(OutputView.DUPLICATE_CAR_NAME);
        }
        for (String carName : carNameList) {
            if (isCarNameEmpty(carName)) {
                throw new IllegalArgumentException(OutputView.EMPTY_CAR_NAME);
            }
            if (isCarNameOversize(carName)) {
                throw new IllegalArgumentException(OutputView.OVERSIZE_CAR_NAME);
            }
        }
    }

    private boolean isCarNameOversize(String carName) {
        if (carName.length() > CAR_NAME_MAX_SIZE) {
            return true;
        }
        return false;
    }

    private boolean isCarNameEmpty(String carName) {
        if (carName.length() == 0) {
            return true;
        }
        return false;
    }

    private boolean isCarNameDuplicate(List<String> carNameList) {
        if (carNameList.stream()
            .distinct()
            .count() == carNameList.size()) {
            return false;
        }
        return true;
    }
}
