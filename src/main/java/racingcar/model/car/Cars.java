package racingcar.model.car;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars(CarsName carsName) {
        cars = new ArrayList<>();
        carsName.get()
            .forEach(carName -> cars.add(new Car(carName)));
    }

    public void race() {
        cars.forEach(car -> {
            car.move();
            car.print();
        });
        System.out.println();
    }
}
