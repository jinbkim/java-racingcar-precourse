package racingcar.utils;

import java.util.List;
import racingcar.view.OutputView;

public class InputValidator {

    private static final int CAR_NAME_MAX_SIZE = 5;

    public void validateCarNameList(List<String> carNameList) {
        if (isDuplicateCarName(carNameList)) {
            throw new IllegalArgumentException(OutputView.CAR_NAME_DUPLICATE);
        }
        for (String carName : carNameList) {
            if (carName.length() == 0) {
                throw new IllegalArgumentException(OutputView.CAR_NAME_NOT_EMPTY);
            }
            if (carName.length() > CAR_NAME_MAX_SIZE) {
                throw new IllegalArgumentException(OutputView.CAR_NAME_OVER_SIZE);
            }
        }
    }

    private boolean isDuplicateCarName(List<String> carNameList) {
        if (carNameList.stream()
            .distinct()
            .count() == carNameList.size()) {
            return false;
        }
        return true;
    }
}
