package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class CarsModel {

    private List<Car> cars;

    public CarsModel() {
    }

    public void setCars(List<String> carNameList) {
        cars = new ArrayList<>();
        carNameList.stream()
            .forEach(carName -> cars.add(new Car(carName)));
    }


    // test
    @Override
    public String toString() {
        cars.forEach(c -> System.out.println(c.getName()));
        return "";
    }
}
