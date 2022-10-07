package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private static final int RANDOM_MIN_NUMBER = 0;
    private static final int RANDOM_MAX_NUMBER = 9;
    private static final int MOVEABLE_LEVEL = 4;

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void moveOneSpace() {
        int randomNumber = Randoms.pickNumberInRange(RANDOM_MIN_NUMBER, RANDOM_MAX_NUMBER);
        if (randomNumber > MOVEABLE_LEVEL) {
            position += 1;
        }
    }

    public void printResult() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getName() + " : ");
        for (int i = 0; i < position; i++) {
            stringBuilder.append("-");
        }
        System.out.println(stringBuilder);
    }

    // test
    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", position=" + position + '}';
    }
}
