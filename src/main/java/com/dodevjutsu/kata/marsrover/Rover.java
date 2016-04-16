package com.dodevjutsu.kata.marsrover;

import java.util.ArrayList;
import java.util.List;

public class Rover {
    private Vector vector;

    public Rover(int x, int y, String directionCode) {
        this.vector = new Vector(new Coordinates(x, y), Direction.pointingTo(directionCode));
    }

    public void receive(String commandCodes) {
        CommandsSequence commandsSequence = new CommandsSequence(commandCodes);
        vector = commandsSequence.apply(vector);
    }

    @Override
    public String toString() {
        return "Rover{" +
            "vector=" + vector +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        return vector != null ? vector.equals(rover.vector) : rover.vector == null;

    }

    @Override
    public int hashCode() {
        return vector != null ? vector.hashCode() : 0;
    }
}
