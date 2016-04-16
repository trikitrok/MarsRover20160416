package com.dodevjutsu.kata.marsrover;

public enum Direction {
    NORTH, SOUTH, EAST, WEST;

    public static Direction pointingTo(String directioncode) {
        if(directioncode.equals("N")) {
            return NORTH;
        } else if (directioncode.equals("S")){
            return SOUTH;
        } else if(directioncode.equals("E")){
            return EAST;
        } else {
            return WEST;
        }
    }
}
