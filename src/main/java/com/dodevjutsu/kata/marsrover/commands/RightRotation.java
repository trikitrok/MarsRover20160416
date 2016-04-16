package com.dodevjutsu.kata.marsrover.commands;

import com.dodevjutsu.kata.marsrover.Command;
import com.dodevjutsu.kata.marsrover.Vector;

class RightRotation implements Command {
    public Vector apply(Vector vector) {
        return vector.rotateRight();
    }
}
