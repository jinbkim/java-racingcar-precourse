package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.utils.InputValidator;

public class InputView {

    private InputValidator inputValidator = new InputValidator();

    public List<String> requestCarNameList() {
        String input = requestInput(OutputView.REQUEST_CAR_NAME_LIST);
        List<String> carNameList = parseCarNameList(input);

        try {
            inputValidator.validateCarNameList(carNameList);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return requestCarNameList();
        }
        return carNameList;
    }

    public List<String> parseCarNameList(String input) {
        List<String> carNameList = Arrays.stream(input.split(","))
            .map(String::trim)
            .collect(Collectors.toList());

        return carNameList;
    }

    public int requestTryNumber() {
        String input = requestInput(OutputView.REQUEST_TRY_NUMBER).trim();

        try {
            inputValidator.validateTryNumber(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return requestTryNumber();
        }
        return Integer.parseInt(input);
    }

    private String requestInput(String request) {
        System.out.print(request);
        return Console.readLine();
    }
}
