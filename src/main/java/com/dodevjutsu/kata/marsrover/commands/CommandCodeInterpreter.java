package com.dodevjutsu.kata.marsrover.commands;

import com.dodevjutsu.kata.marsrover.Command;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CommandCodeInterpreter {
    private static final int DISPLACEMENT_LENGTH = 1;
    private static final String FORWARD_MOVEMENT = "f";
    private static final String BACKWARD_MOVEMENT = "b";
    private static final String RIGHT_ROTATION = "r";
    private static final String LEFT_ROTATION = "l";
    private static Map<String, Command> knownCommands = knownCommands();

    public static Command interpret(String commandCode) {
        if(isAnUnknown(commandCode)) {
            return new UnknownCommand();
        }
        return getCommandFor(commandCode);
    }

    private static Command getCommandFor(String commandCode) {
        return knownCommands.get(commandCode);
    }

    private static boolean isAnUnknown(String commandCode) {
        return !knownCommands.containsKey(commandCode);
    }

    private static Map<String, Command> knownCommands() {
        Map<String, Command> knownCommands = new HashMap<>();
        knownCommands.put(FORWARD_MOVEMENT, new Movement(DISPLACEMENT_LENGTH));
        knownCommands.put(BACKWARD_MOVEMENT, new Movement(-DISPLACEMENT_LENGTH));
        knownCommands.put(RIGHT_ROTATION, new RightRotation());
        knownCommands.put(LEFT_ROTATION, new LeftRotation());
        return Collections.unmodifiableMap(knownCommands);
    }
}
