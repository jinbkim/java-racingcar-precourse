package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.view.OutputView;

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

    public void printWinner() {
        List<String> winnerNameList = getWinnerNameList();
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(OutputView.WINNER + " : ");
        for (int i = 0; i < winnerNameList.size(); i++) {
            stringBuilder.append(winnerNameList.get(i));
            if (i != winnerNameList.size() - 1) {
                stringBuilder.append(", ");
            }
        }
        System.out.println(stringBuilder);
    }

    private List<String> getWinnerNameList() {
        int maxPosition = getMaxPosition();

        return cars.stream()
            .filter(c -> c.getPosition() == maxPosition)
            .map(c -> c.getName())
            .collect(Collectors.toList());
    }

    private int getMaxPosition() {
        int maxPosition = 0;

        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
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
