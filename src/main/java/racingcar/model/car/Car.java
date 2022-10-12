package racingcar.model.car;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private static final int RAND_NUM_MIN = 0;
    private static final int RAND_NUM_MAX = 9;
    private static final int MOVAVLE_LEVEL = 4;

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void move() {
        if (getRandNum() >= MOVAVLE_LEVEL) {
            position += 1;
        }
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(name + " : ");
        for (int i = 0; i < position; i++) {
            stringBuilder.append("-");
        }
        System.out.println(stringBuilder);
    }

    public int compareTo(Car car) {
        return this.position - car.position;
    }

    public boolean isSamePosition(Car car) {
        return this.position == car.position;
    }

    private int getRandNum() {
        return Randoms.pickNumberInRange(RAND_NUM_MIN, RAND_NUM_MAX);
    }
}
