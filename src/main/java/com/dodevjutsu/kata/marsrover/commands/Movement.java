package com.dodevjutsu.kata.marsrover.commands;

import com.dodevjutsu.kata.marsrover.Command;
import com.dodevjutsu.kata.marsrover.Vector;

class Movement implements Command {
    private final int displacement;

    public Movement(int displacement) {
        this.displacement = displacement;
    }

    public Vector apply(Vector vector) {
        return vector.move(displacement);
    }
}
