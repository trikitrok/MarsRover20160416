package com.dodevjutsu.kata.marsrover.commands;

import com.dodevjutsu.kata.marsrover.Command;
import com.dodevjutsu.kata.marsrover.Vector;

class UnknownCommand implements Command {

    @Override
    public Vector apply(Vector vector) {
        return vector;
    }
}
