package com.dodevjutsu.kata.marsrover;

public class Movement {
    private final int displacement;

    public Movement(int displacement) {
        this.displacement = displacement;
    }

    public Vector apply(Vector vector) {
        return vector.move(displacement);
    }
}
