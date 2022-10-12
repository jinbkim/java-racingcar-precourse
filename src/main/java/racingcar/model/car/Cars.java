package racingcar.model.car;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import racingcar.view.OutputView;

public class Cars {

    private static final String WINNER_SEP = ", ";

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

    public void race() {
        cars.forEach(car -> {
            car.move();
            car.print();
        });
        System.out.println();
    }

    public void printWinner() {
        StringBuilder stringBuilder = new StringBuilder();
        String winners = findWinnerAll().stream()
            .map(car -> car.getName())
            .collect(Collectors.joining(WINNER_SEP));

        stringBuilder.append(OutputView.WINNER + " : ");
        stringBuilder.append(winners);
        System.out.println(stringBuilder);
    }

    public List<Car> findWinnerAll() {
        Car winner = findWinnerFirst();

        return cars.stream()
            .filter(car -> car.isSamePosition(winner))
            .collect(Collectors.toList());
    }

    private Car findWinnerFirst() {
        return cars.stream()
            .max(Car::compareTo)
            .get();
    }
}
