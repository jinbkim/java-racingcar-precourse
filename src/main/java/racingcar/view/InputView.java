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
        String input = requestInput(OutputView.RACING_CAR_INPUT);
        List<String> carNameList = parseInput(input);

        try {
            inputValidator.isValidateCarNameList(carNameList);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            requestRacingCar();
        }
        return carNameList;
    }

    public int requestRaceTryNumber() {
        String input = requestInput(OutputView.TRY_NUMBER).trim();

        try {
            inputValidator.isValidateRaceTryNumber(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return requestRaceTryNumber();
        }
        return Integer.parseInt(input);
    }

    private String requestInput(String request) {
        System.out.println(request);
        return Console.readLine();
    }

    private List<String> parseInput(String input) {
        return Arrays.stream(input.split(","))
            .map(String::trim)
            .collect(Collectors.toList());
    }
}
