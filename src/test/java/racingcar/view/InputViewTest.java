package racingcar.view;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class InputViewTest {

    private InputView inputView = new InputView();

    @Test()
    void 자동차_이름_정상적인_입력_받기() {
        String input = "보라돌이,   뚜비, 나나   ,   뽀   ";
        List<String> carNameList = inputView.parseCarNameList(input);
        assertThat(carNameList).contains("보라돌이", "뚜비", "나나", "뽀");
    }
}
