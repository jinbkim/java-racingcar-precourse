package racingcar.utils;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InputValidatorTest {

    private InputValidator inputValidator = new InputValidator();
    private List<String> carNameList;

    @BeforeEach
    void 초기값() {
        carNameList = new ArrayList<>();
        carNameList.add("보라돌이");
        carNameList.add("뚜비");
        carNameList.add("나나");
        carNameList.add("뽀");
    }

    @Test()
    void 자동차_이름_정상적인_입력_검증() {
        assertThatCode(() -> {
            inputValidator.validateCarNameList(carNameList);
        }).doesNotThrowAnyException();
    }

    @Test()
    void 자동차_이름이_공백인_입력_받기() {
        carNameList.add("");
        assertThatThrownBy(() -> inputValidator.validateCarNameList(carNameList));
    }

    @Test()
    void 자동차_이름이_크기가_6이상인_입력_받기() {
        carNameList.add("123456");
        assertThatThrownBy(() -> inputValidator.validateCarNameList(carNameList));
    }

    @Test()
    void 자동차_이름이_중복된_입력_받기() {
        carNameList.add("나나");
        assertThatThrownBy(() -> inputValidator.validateCarNameList(carNameList));
    }
}
