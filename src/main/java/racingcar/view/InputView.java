package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.utils.InputValidator;

public class InputView {

    private InputValidator inputValidator = new InputValidator();

    public InputView() {
    }

    public List<String> requestRacingCar() {
        System.out.println(OutputView.RACING_CAR_INPUT);
        List<String> carNameList = Arrays.stream(Console.readLine()
                .split(","))
            .map(String::trim)
            .collect(Collectors.toList());
        try {
            inputValidator.isValidateCarNameList(carNameList);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            requestRacingCar();
        }
        return carNameList;
    }
}
