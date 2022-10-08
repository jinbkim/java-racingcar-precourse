package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private static final int RANDOM_MIN_NUMBER = 0;
    private static final int RANDOM_MAX_NUMBER = 9;
    private static final int MOVEALBE_LEVEL = 4;

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        int randomNumber = Randoms.pickNumberInRange(RANDOM_MIN_NUMBER, RANDOM_MAX_NUMBER);
        if (randomNumber >= MOVEALBE_LEVEL) {
            position += 1;
        }
    }
}
