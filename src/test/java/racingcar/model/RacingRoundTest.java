package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RacingRoundTest {

    @Test
    void 이동_횟수_정상적인_입력_받기() {
        Assertions.assertThatCode(() -> new RacingRound("  1"))
            .doesNotThrowAnyException();
        Assertions.assertThatCode(() -> new RacingRound("2  "))
            .doesNotThrowAnyException();
        Assertions.assertThatCode(() -> new RacingRound("  3  "))
            .doesNotThrowAnyException();
        Assertions.assertThatCode(() -> new RacingRound("  01  "))
            .doesNotThrowAnyException();
    }

    @Test
    void 이동_횟수_비정상적인_입력_받기() {
        Assertions.assertThatThrownBy(() -> new RacingRound("a"));
        Assertions.assertThatThrownBy(() -> new RacingRound("12a"));
        Assertions.assertThatThrownBy(() -> new RacingRound("0"));
        Assertions.assertThatThrownBy(() -> new RacingRound("00"));
    }
}