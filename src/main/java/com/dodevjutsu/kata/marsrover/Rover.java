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

        for (int i = 0; i < commandsSequence.length(); ++i) {
            String commandCode = commandsSequence.substring(i, i+1);
            applyCommand(commandCode);
        }
    }

    private void applyCommand(String commandCode) {
        if (isRightRotation(commandCode)) {
            rotateRight();
        } else if (isLeftRotation(commandCode)) {
            rotateLeft();
        } else {
            move(commandCode);
        }
    }

    private boolean isLeftRotation(String commandCode) {
        return commandCode.equals("l");
    }

    private boolean isRightRotation(String commandCode) {
        return commandCode.equals("r");
    }

    private void rotateLeft() {
        direction = direction.rotateLeft();
    }

    private void rotateRight() {
        direction = direction.rotateRight();
    }

    private void move(String commandCode) {
        int displacement = computeDisplacement(commandCode);
        coordinates = direction.move(coordinates, displacement);
    }

    private int computeDisplacement(String commandCode) {
        final int DISPLACEMENT_LENGTH = 1;
        int displacement = -DISPLACEMENT_LENGTH;
        if (commandCode.equals("f")) {
            displacement = DISPLACEMENT_LENGTH;
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
