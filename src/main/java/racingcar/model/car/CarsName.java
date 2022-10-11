package racingcar.model.car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.utils.InputValidator;

public class CarsName {

    private static final String INPUT_SEP = ",";

    private final InputValidator inputValidator = new InputValidator();

    private List<String> carsName;

    public CarsName(String input) {
        carsName = Arrays.stream(input.split(INPUT_SEP))
            .map(String::trim)
            .collect(Collectors.toList());
        inputValidator.validateCarsName(carsName);
    }

    public List<String> get() {
        return carsName;
    }
}
