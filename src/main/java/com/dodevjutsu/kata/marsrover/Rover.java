package com.dodevjutsu.kata.marsrover;

public class Rover {
    private Coordinates coordinates;
    private Direction direction;

    public Rover(int x, int y, String directionCode) {
        this.coordinates = new Coordinates(x, y);
        this.direction = Direction.pointingTo(directionCode);
    }

    public void receive(String commandsSequence) {
        if (commandsSequence.equals("")) {
            return;
        }

        if (commandsSequence.equals("r")) {
            direction = direction.rotateRight();
        } else if (commandsSequence.equals("l")) {
            direction = direction.rotateLeft();
        } else {
            move(commandsSequence);
        }
    }

    private void move(String commandsSequence) {
        int displacement = computeDisplacement(commandsSequence);
        coordinates = direction.move(coordinates, displacement);
    }

    private int computeDisplacement(String commandsSequence) {
        int displacement = -1;
        if (commandsSequence.equals("f")) {
            displacement = 1;
        }
        return displacement;
    }

    @Override
    public String toString() {
        return "Rover{" +
            "direction='" + direction + '\'' +
            ", coordinates=" + coordinates +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (direction != null ? !direction.equals(rover.direction) : rover.direction != null) return false;
        return coordinates != null ? coordinates.equals(rover.coordinates) : rover.coordinates == null;

    }

    @Override
    public int hashCode() {
        int result = direction != null ? direction.hashCode() : 0;
        result = 31 * result + (coordinates != null ? coordinates.hashCode() : 0);
        return result;
    }
}
