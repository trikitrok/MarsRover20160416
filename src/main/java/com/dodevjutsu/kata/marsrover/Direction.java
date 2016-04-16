package com.dodevjutsu.kata.marsrover;

public enum Direction {
    NORTH, SOUTH;

    public static Direction pointingTo(String directioncode) {
        if(directioncode.equals("N")) {
            return NORTH;
        } else {
            return SOUTH;
        }
    }
}
