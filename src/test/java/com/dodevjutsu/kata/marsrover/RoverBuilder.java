package com.dodevjutsu.kata.marsrover;

public class RoverBuilder {
    private int y;
    private int x;
    private String directionCode;

    public static RoverBuilder aRover() {
        return new RoverBuilder();
    }

    public RoverBuilder at(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public RoverBuilder facing(String directionCode) {
        this.directionCode = directionCode;
        return this;
    }

    public Rover build() {
        return new Rover(x, y, directionCode);
    }
}
