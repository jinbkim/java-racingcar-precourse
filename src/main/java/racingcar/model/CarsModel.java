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

    public void race() {
        cars.forEach(c -> {
            c.moveOneSpace();
            c.printResult();
        });
        System.out.println();
    }


    // test
    @Override
    public String toString() {
        cars.forEach(c -> {
            System.out.println(c.getName() + ", " + c.getPosition());
        });
        return "";
    }
}
