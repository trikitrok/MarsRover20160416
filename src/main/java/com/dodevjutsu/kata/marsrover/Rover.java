package com.dodevjutsu.kata.marsrover;

import com.dodevjutsu.kata.marsrover.coordinates.FreeCoordinates;
import com.dodevjutsu.kata.marsrover.coordinates.InWorldCoordinates;
import com.dodevjutsu.kata.marsrover.worlds.InfiniteWorld;

public class Rover {
    private Vector vector;

    public Rover(int x, int y, String directionCode) {
        this(x, y, directionCode, new InfiniteWorld());
    }

    public Rover(int x, int y, String directionCode, World world) {
        this.vector = new Vector(
            new InWorldCoordinates(new FreeCoordinates(x, y), world),
            Direction.pointingTo(directionCode)
        );
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
