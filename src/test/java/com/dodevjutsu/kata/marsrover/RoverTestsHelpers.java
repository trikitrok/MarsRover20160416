package com.dodevjutsu.kata.marsrover;

public class RoverTestsHelpers {
    public static Rover locatedAt(int x, int y, String direction) {
        return new Rover(x, y, direction);
    }
}
