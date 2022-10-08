package racingcar.view;

public class OutputView {

    public static final String REQUEST_CAR_NAME_LIST = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n";

    private static final String ERROR = "[ERROR]";

    public static final String CAR_NAME_NOT_EMPTY = ERROR + " 이름의 크기는 1 이상 이어야 합니다.";
    public static final String CAR_NAME_OVER_SIZE = ERROR + " 이름의 크기 5자 이하 이어야 합니다.";
    public static final String CAR_NAME_DUPLICATE = ERROR + " 중복된 이름이 존재합니다.";

}
