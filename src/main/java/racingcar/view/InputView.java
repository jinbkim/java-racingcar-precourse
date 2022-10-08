package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public List<String> requestCarNameList() {
        String input = requestInput(OutputView.REQUEST_CAR_NAME_LIST);

        return Arrays.stream(input.split(","))
            .map(String::trim)
            .collect(Collectors.toList());
    }

    private String requestInput(String request) {
        System.out.print(request);
        return Console.readLine();
    }
}
