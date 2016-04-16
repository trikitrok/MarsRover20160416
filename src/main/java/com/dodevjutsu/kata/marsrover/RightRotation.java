package com.dodevjutsu.kata.marsrover;

public class RightRotation implements Command {
    public Vector apply(Vector vector) {
        return vector.rotateRight();
    }
}
