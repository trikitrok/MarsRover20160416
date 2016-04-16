package com.dodevjutsu.kata.marsrover;

import com.dodevjutsu.kata.marsrover.commands.CommandCodeInterpreter;

import java.util.ArrayList;
import java.util.List;

public class CommandsSequence {
    List<Command> commands = new ArrayList<>();

    CommandsSequence(String commandCodes) {
        for (int i = 0; i < commandCodes.length(); ++i) {
            String commandCode = commandCodes.substring(i, i+1);
            commands.add(CommandCodeInterpreter.interpret(commandCode));
        }
    }

    public Vector apply(Vector vector) {
        for(Command command : commands) {
            vector = command.apply(vector);
        }
        return vector;
    }
}
