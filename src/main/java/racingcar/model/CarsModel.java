package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.view.OutputView;

public class CarsModel {

    private List<Car> carList;

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

    public void printWinner() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(OutputView.WINNER + " : ");
        List<Car> winnerList = getWinnerList();
        for (int i = 0; i < winnerList.size(); i++) {
            stringBuilder.append(winnerList.get(i)
                .getName());
            if (i != winnerList.size() - 1) {
                stringBuilder.append(", ");
            }
        }
        System.out.println(stringBuilder);
    }

    private List<Car> getWinnerList() {
        int winnerPosition = getWinnerPosition();
        return carList.stream()
            .filter(c -> c.getPosition() == winnerPosition)
            .collect(Collectors.toList());
    }

    private int getWinnerPosition() {
        int maxPosition = 0;
        for (Car car : carList) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
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
