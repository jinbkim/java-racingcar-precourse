package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public List<String> parseCarNameList(String input) {
        return Arrays.stream(input.split(","))
            .map(String::trim)
            .collect(Collectors.toList());
    }

    public String requestInput(String request) {
        System.out.print(request);
        return Console.readLine();
    }
}
