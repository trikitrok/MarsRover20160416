package com.dodevjutsu.kata.marsrover;

public class Rover {
    private final String direction;
    private Coordinates coordinates;

    public Rover(int x, int y, String direction) {
        this.direction = direction;
        this.coordinates = new Coordinates(x, y);
    }

    private void setCoordinate(int x, int y) {
        this.coordinates = new Coordinates(x, y);
    }

    public void receive(String commandsSequence) {
        if (commandsSequence.equals("")) {
            return;
        }

        if(direction.equals("N")) {
            setCoordinate(coordinates.x(), coordinates.y() +1);
        } else if(direction.equals("E")){
            setCoordinate(coordinates.x() + 1, coordinates.y());
        } else if(direction.equals("S")) {
            setCoordinate(coordinates.x(), coordinates.y() - 1);
        } else {
            setCoordinate(coordinates.x() - 1, coordinates.y());
        }
    }

    @Override
    public String toString() {
        return "Rover{" +
            "x=" + coordinates.x() +
            ", y=" + coordinates.y() +
            ", direction='" + direction + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (coordinates.x() != rover.coordinates.x()) return false;
        if (coordinates.y() != rover.coordinates.y()) return false;
        return direction != null ? direction.equals(rover.direction) : rover.direction == null;

    }

    @Override
    public int hashCode() {
        int result = coordinates.x();
        result = 31 * result + coordinates.y();
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }
}
