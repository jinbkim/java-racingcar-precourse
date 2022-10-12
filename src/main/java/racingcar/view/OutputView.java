package racingcar.view;

public class OutputView {

    public static final String REQUEST_CARS_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String REQUEST_RACING_ROUND = "시도할 회수는 몇회인가요?";
    public static final String RESULT = "실행 결과";
    public static final String WINNER = "최종 우승자";

    private static final String ERROR = "[ERROR]";
    public static final String WRONG_CAR_NAME_LEN = ERROR + " 자동차 이름의 크기는 1자 이상, 5자 이하 이어야 합니다.";
    public static final String WRONG_RACING_ROUND = ERROR + " 시도 횟수는 숫자여야 합니다.";
    public static final String RACING_ROUND_NONE_ZERO = ERROR + " 시도 횟수는 1회 이상 이어야 합니다.";

}
