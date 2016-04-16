package com.dodevjutsu.kata.marsrover;

public class Rover {
    private final String direction;
    private Coordinates coordinates;

    public Rover(int x, int y, String direction) {
        this.direction = direction;
        this.coordinates = new Coordinates(x, y);
    }

    public void receive(String commandsSequence) {
        if (commandsSequence.equals("")) {
            return;
        }

        int displacement = -1;
        if(commandsSequence.equals("f")) {
          displacement = 1;
        }

        if (direction.equals("N")) {
            coordinates = coordinates.add(new Coordinates(0, displacement));
        } else if (direction.equals("E")) {
            coordinates = coordinates.add(new Coordinates(displacement, 0));
        } else if (direction.equals("S")) {
            coordinates = coordinates.add(new Coordinates(0, -displacement));
        } else {
            coordinates = coordinates.add(new Coordinates(-displacement, 0));
        }
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
