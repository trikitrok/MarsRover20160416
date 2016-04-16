package com.dodevjutsu.kata.marsrover;

public class LeftRotation implements Command {
    public Vector apply(Vector vector) {
        return vector.rotateLeft();
    }
}
