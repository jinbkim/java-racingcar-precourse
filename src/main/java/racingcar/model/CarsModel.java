package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class CarsModel {

    private List<Car> carList;

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<String> carNameList) {
        carList = new ArrayList<>();
        carNameList.forEach(c -> carList.add(new Car(c)));
    }

    public void race() {
        carList.forEach(c -> c.move());
    }
}
