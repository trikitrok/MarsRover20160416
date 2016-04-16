package com.dodevjutsu.kata.marsrover;

public class Vector {
    private final Coordinates origin;
    private final Direction direction;

    public Vector(Coordinates origin, Direction direction) {
        this.origin = origin;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Vector{" +
            "origin=" + origin +
            ", direction=" + direction +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector vector = (Vector) o;

        if (origin != null ? !origin.equals(vector.origin) : vector.origin != null) return false;
        return direction == vector.direction;

    }

    @Override
    public int hashCode() {
        int result = origin != null ? origin.hashCode() : 0;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }

    public Coordinates origin() {
        return origin;
    }

    public Direction direction() {
        return direction;
    }
}
