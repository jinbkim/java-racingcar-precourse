package racingcar.model.car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CarsNameTest {

    @Test
    void 자동차_이름_입력값_파싱() {
        String input = "pobi,woni,jun";
        CarsName carsName = new CarsName(input);

        Assertions.assertThat(carsName.get())
            .contains("pobi", "woni", "jun");
    }
}