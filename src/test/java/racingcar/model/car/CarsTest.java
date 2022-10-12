package racingcar.model.car;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CarsTest {

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
        List<String> winnersName = cars.findWinnerAll()
            .stream()
            .map(car -> car.getName())
            .collect(Collectors.toList());

        Assertions.assertThat(winnersName)
            .contains("다라", "마바", "사아");
        Assertions.assertThat(winnersName)
            .doesNotContain("가나");
    }
}