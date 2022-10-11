package racingcar.model.car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarsName {

    private List<String> carsName;

    public CarsName(String input) {
        carsName = Arrays.stream(input.split(","))
            .map(String::trim)
            .collect(Collectors.toList());
    }

    public List<String> get() {
        return carsName;
    }
}
