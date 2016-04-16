package com.dodevjutsu.kata.marsrover;

import java.util.ArrayList;
import java.util.List;

public class CommandsSequence {
    List<Command> commands = new ArrayList<>();

    CommandsSequence(String commandCodes) {
        for (int i = 0; i < commandCodes.length(); ++i) {
            String commandCode = commandCodes.substring(i, i+1);

            if (isRightRotation(commandCode)) {
                commands.add(new RightRotation());
            } else if (isLeftRotation(commandCode)) {
                commands.add(new LeftRotation());
            } else {
                int displacement = computeDisplacement(commandCode);
                commands.add(new Movement(displacement));
            }
        }
    }

    public Vector apply(Vector vector) {
        for(Command command : commands) {
            vector = command.apply(vector);
        }
        return vector;
    }

    private boolean isLeftRotation(String commandCode) {
        return commandCode.equals("l");
    }

    private boolean isRightRotation(String commandCode) {
        return commandCode.equals("r");
    }

    private int computeDisplacement(String commandCode) {
        final int DISPLACEMENT_LENGTH = 1;
        int displacement = -DISPLACEMENT_LENGTH;
        if (commandCode.equals("f")) {
            displacement = DISPLACEMENT_LENGTH;
        }
        return displacement;
    }
}
