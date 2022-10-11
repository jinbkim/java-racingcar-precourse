package racingcar.model;

import racingcar.utils.InputValidator;

public class RacingRound {

    private final InputValidator inputValidator = new InputValidator();

    private int racingRound;

    public RacingRound(String input) {
        input = input.trim();
        inputValidator.validateRacingRound(input);
        racingRound = Integer.parseInt(input);
    }

    public boolean isGameOver() {
        if (racingRound == 0) {
            return true;
        }
        racingRound -= 1;
        return false;
    }

}