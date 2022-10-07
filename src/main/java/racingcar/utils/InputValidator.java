package racingcar.utils;

import java.util.List;
import java.util.regex.Pattern;
import racingcar.view.OutputView;

public class InputValidator {

    private static final int CAR_NAME_MAX_SIZE = 5;

    private static final String NUMBER_REGEX = "^[0-9]*$";

    public InputValidator() {
    }

    public void isValidateCarNameList(List<String> carNameList) {
        if (isCarNameDuplicate(carNameList)) {
            throw new IllegalArgumentException(OutputView.DUPLICATE_CAR_NAME);
        }
        for (String carName : carNameList) {
            if (carName.length() == 0) {
                throw new IllegalArgumentException(OutputView.EMPTY_CAR_NAME);
            }
            if (carName.length() > CAR_NAME_MAX_SIZE) {
                throw new IllegalArgumentException(OutputView.OVERSIZE_CAR_NAME);
            }
        }
    }

    private boolean isCarNameDuplicate(List<String> carNameList) {
        if (carNameList.stream()
            .distinct()
            .count() == carNameList.size()) {
            return false;
        }
        return true;
    }

    public void isValidateRaceTryNumber(String raceTryNumber) {
        if (!Pattern.matches(NUMBER_REGEX, raceTryNumber)) {
            throw new IllegalArgumentException(OutputView.ONLY_NUMBER);
        }
        if (Integer.parseInt(raceTryNumber) == 0) {
            throw new IllegalArgumentException(OutputView.NONE_ZERO);
        }
    }
}
