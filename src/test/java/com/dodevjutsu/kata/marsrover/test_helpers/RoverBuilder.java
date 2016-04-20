package com.dodevjutsu.kata.marsrover.test_helpers;

import com.dodevjutsu.kata.marsrover.worlds.InfiniteWorld;
import com.dodevjutsu.kata.marsrover.Rover;
import com.dodevjutsu.kata.marsrover.World;

public class RoverBuilder {
    private World world;
    private int y;
    private int x;
    private String directionCode;

    public static RoverBuilder aRover() {
        return new RoverBuilder();
    }

    private RoverBuilder() {
        this.world = new InfiniteWorld();
    }


    public RoverBuilder at(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public RoverBuilder inWorld(World world) {
        this.world = world;
        return this;
    }

    public RoverBuilder facing(String directionCode) {
        this.directionCode = directionCode;
        return this;
    }

    public Rover build() {
        return new Rover(x, y, directionCode, world);
    }
}
