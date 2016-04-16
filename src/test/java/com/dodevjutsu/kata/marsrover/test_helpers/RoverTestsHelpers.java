package com.dodevjutsu.kata.marsrover.test_helpers;

import com.dodevjutsu.kata.marsrover.Rover;

public class RoverTestsHelpers {
    public static Rover locatedAt(int x, int y, String direction) {
        return new Rover(x, y, direction);
    }
}
