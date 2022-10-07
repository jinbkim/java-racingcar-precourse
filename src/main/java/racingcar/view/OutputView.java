package racingcar.view;

public class OutputView {

    private static final String ERROR = "[ERROR]";

    public static final String RACING_CAR_INPUT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String OVERSIZE_CAR_NAME = ERROR + " 자동차 이름은 5자 이하만 가능합니다.";
    public static final String EMPTY_CAR_NAME = ERROR + " 비어있는 자동차 이름이 존재합니다.";
    public static final String DUPLICATE_CAR_NAME = ERROR + " 중복된 자동차 이름이 존재합니다.";

    public OutputView() {
    }
}
