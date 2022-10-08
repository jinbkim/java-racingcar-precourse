package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import racingcar.view.OutputView;

public class CarsModel {

    private List<Car> carList;

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<String> carNameList) {
        carList = new ArrayList<>();
        carNameList.forEach(c -> carList.add(new Car(c)));
    }

    public void race(int tryNumber) {
        System.out.println(OutputView.RACE_RESULT);
        for (int i = 0; i < tryNumber; i++) {
            carList.forEach(c -> c.move());
            printCarListPosition();
        }
    }

    private void printCarListPosition() {
        StringBuilder stringBuilder = new StringBuilder();

        carList.forEach(c -> {
            stringBuilder.append(c.getName() + " : ");
            for (int i = 0; i < c.getPosition(); i++) {
                stringBuilder.append("-");
            }
            stringBuilder.append("\n");
        });
        System.out.println(stringBuilder);
    }
}
