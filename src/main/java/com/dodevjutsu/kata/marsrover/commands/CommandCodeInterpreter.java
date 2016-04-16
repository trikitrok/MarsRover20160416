package com.dodevjutsu.kata.marsrover.commands;

import com.dodevjutsu.kata.marsrover.Command;

public class CommandCodeInterpreter {
    private static final int DISPLACEMENT_LENGTH = 1;

    public static Command interpret(String commandCode) {
        if (isRightRotation(commandCode)) {
            return new RightRotation();
        } else if (isLeftRotation(commandCode)) {
            return new LeftRotation();
        } else if (isForwardMovement(commandCode)){
            return new Movement(DISPLACEMENT_LENGTH);
        }
        else if (isBackwardMovement(commandCode)){
            return new Movement(-DISPLACEMENT_LENGTH);
        } else {
            return new UnknownCommand();
        }
    }

    private static boolean isForwardMovement(String commandCode) {
        return commandCode.equals("f");
    }

    private static boolean isBackwardMovement(String commandCode) {
        return commandCode.equals("b");
    }

    private static boolean isLeftRotation(String commandCode) {
        return commandCode.equals("l");
    }

    private static boolean isRightRotation(String commandCode) {
        return commandCode.equals("r");
    }
}
