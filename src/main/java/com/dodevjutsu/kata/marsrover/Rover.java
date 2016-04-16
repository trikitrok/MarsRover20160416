package com.dodevjutsu.kata.marsrover;

public class Rover {
    private Vector vector;

    public Rover(int x, int y, String directionCode) {
        this.vector = new Vector( new Coordinates(x, y), Direction.pointingTo(directionCode));
    }

    public void receive(String commandsSequence) {
        for (int i = 0; i < commandsSequence.length(); ++i) {
            String commandCode = commandsSequence.substring(i, i+1);
            if (isRightRotation(commandCode)) {
                this.vector = new RightRotation(). apply(vector);
            } else if (isLeftRotation(commandCode)) {
                this.vector = new LeftRotation().apply(vector);
            } else {
                int displacement = computeDisplacement(commandCode);
                this.vector= new Movement(displacement).apply(vector);
            }
        }
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
