package racingcar.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CarsModel {

    private List<Car> cars;

    public CarsModel() {
    }

    public void setCars(String racingCarInput) {
        cars = new LinkedList<>();
        Arrays.stream(racingCarInput.split(","))
            .map(String::trim)
            .collect(Collectors.toList())
            .forEach(carName -> cars.add(new Car(carName)));
    }


    // test
    @Override
    public String toString() {
        cars.forEach(c -> System.out.println(c.getName()));
        return "";
    }
}
