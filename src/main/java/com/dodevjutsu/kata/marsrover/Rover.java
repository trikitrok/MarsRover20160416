package com.dodevjutsu.kata.marsrover;

public class Rover {
    private int x;
    private int y;
    private final String direction;

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void receive(String commandsSequence) {
        if (commandsSequence.equals("")) {
            return;
        }

        if(direction.equals("N")) {
            y = y + 1;
        } else {
            x = x + 1;
        }
    }

    @Override
    public String toString() {
        return "Rover{" +
            "x=" + x +
            ", y=" + y +
            ", direction='" + direction + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (x != rover.x) return false;
        if (y != rover.y) return false;
        return direction != null ? direction.equals(rover.direction) : rover.direction == null;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }
}
