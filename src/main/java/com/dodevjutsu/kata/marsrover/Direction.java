package com.dodevjutsu.kata.marsrover;

public enum Direction {
    NORTH, SOUTH, EAST;

    public static Direction pointingTo(String directioncode) {
        if(directioncode.equals("N")) {
            return NORTH;
        } else if (directioncode.equals("S")){
            return SOUTH;
        } else {
            return EAST;
        }
    }
}
