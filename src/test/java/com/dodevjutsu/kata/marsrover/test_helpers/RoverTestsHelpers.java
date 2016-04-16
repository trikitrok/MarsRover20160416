package com.dodevjutsu.kata.marsrover.test_helpers;

import com.dodevjutsu.kata.marsrover.Rover;

import static com.dodevjutsu.kata.marsrover.test_helpers.RoverBuilder.aRover;

public class RoverTestsHelpers {
    public static Rover locatedAt(int x, int y, String direction) {
        return aRover().at(x, y).facing(direction).build();
    }
}
