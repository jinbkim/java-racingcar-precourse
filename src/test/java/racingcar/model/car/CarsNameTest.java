package racingcar.model.car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CarsNameTest {

    @Test
    void 자동차_이름_입력값_파싱() {
        String input = "pobi,woni,jun";
        CarsName carsName = new CarsName(input);

        Assertions.assertThat(carsName.get())
            .contains("pobi", "woni", "jun");
    }

    @Test
    void 자동차_이름의_비정상적인_입력_받기() {
        Assertions.assertThatThrownBy(() -> new CarsName(",abc"));
        Assertions.assertThatThrownBy(() -> new CarsName("abc, abcdef"));
        Assertions.assertThatThrownBy(() -> new CarsName("abc, abcdef, "));
    }
}