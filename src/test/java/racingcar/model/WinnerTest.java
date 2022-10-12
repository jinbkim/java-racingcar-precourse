package racingcar.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import racingcar.model.car.Cars;

class WinnerTest {

    private static Map<String, Integer> carsMap;

    @BeforeAll
    static void beforeAll() {
        carsMap = new HashMap();
        carsMap.put("가나", 1);
        carsMap.put("다라", 5);
        carsMap.put("마바", 5);
        carsMap.put("사아", 5);
    }

    @Test
    void 우승자_계산하기() {
        Cars cars = new Cars(carsMap);
        Winner winner = new Winner(cars.get());
        List<String> winnersName = winner.get();

        Assertions.assertThat(winnersName)
            .contains("다라", "마바", "사아");
        Assertions.assertThat(winnersName)
            .doesNotContain("가나");
    }
}