package racingcar.view;

public class OutputView {

    public static final String REQUEST_CAR_NAME_LIST = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n";
    public static final String REQUEST_TRY_NUMBER = "시도할 회수는 몇회인가요?\n";
    public static final String RACE_RESULT = "실행 결과";

    private static final String ERROR = "[ERROR]";

    public static final String CAR_NAME_NOT_EMPTY = ERROR + " 이름의 크기는 1 이상 이어야 합니다.";
    public static final String CAR_NAME_OVER_SIZE = ERROR + " 이름의 크기 5자 이하 이어야 합니다.";
    public static final String CAR_NAME_DUPLICATE = ERROR + " 중복된 이름이 존재합니다.";
    public static final String TRY_NUMBER_ONLY_NATURAL_NUMBER = ERROR + " 시도 횟수는 자연수 숫자 이어야 합니다.";
}
