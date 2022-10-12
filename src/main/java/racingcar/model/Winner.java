package racingcar.model;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.model.car.Car;
import racingcar.view.OutputView;

public class Winner {

    private static final String WINNER_SEP = ", ";

    private List<String> winnersName;

    public Winner(List<Car> cars) {
        Car winner = cars.stream()
            .max(Car::compareTo)
            .get();

        winnersName = cars.stream()
            .filter(car -> car.isSamePosition(winner))
            .map(car -> car.getName())
            .collect(Collectors.toList());
    }

    public List<String> get() {
        return winnersName;
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        String joinedWinnersName = winnersName.stream()
            .collect(Collectors.joining(WINNER_SEP));

        stringBuilder.append(OutputView.WINNER + " : ");
        stringBuilder.append(joinedWinnersName);
        System.out.println(stringBuilder);
    }
}
