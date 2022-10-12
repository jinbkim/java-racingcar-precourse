package racingcar.model.car;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Cars {

    private List<Car> cars;

    public Cars(CarsName carsName) {
        cars = new ArrayList<>();
        carsName.get()
            .forEach(carName -> cars.add(new Car(carName)));
    }

    public Cars(Map<String, Integer> carsMap) {
        cars = new ArrayList<>();
        carsMap.forEach((name, position) -> {
            cars.add(new Car(name, position));
        });
    }

    public List<Car> get() {
        return cars;
    }

    public void race() {
        cars.forEach(car -> {
            car.move();
            car.print();
        });
        System.out.println();
    }
}
