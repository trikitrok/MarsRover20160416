package com.dodevjutsu.kata.marsrover;

public class CommandCodeInterpreter {
    public static Command interpret(String commandCode) {
        if (isRightRotation(commandCode)) {
            return new RightRotation();
        } else if (isLeftRotation(commandCode)) {
            return new LeftRotation();
        } else {
            int displacement = getDisplacement(commandCode);
            return new Movement(displacement);
        }
    }

    private static boolean isLeftRotation(String commandCode) {
        return commandCode.equals("l");
    }

    private static boolean isRightRotation(String commandCode) {
        return commandCode.equals("r");
    }

    private static int getDisplacement(String commandCode) {
        final int DISPLACEMENT_LENGTH = 1;
        int displacement = -DISPLACEMENT_LENGTH;
        if (commandCode.equals("f")) {
            displacement = DISPLACEMENT_LENGTH;
        }
        return displacement;
    }
}
