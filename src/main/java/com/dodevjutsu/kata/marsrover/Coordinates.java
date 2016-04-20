package com.dodevjutsu.kata.marsrover;

public interface Coordinates {
    Coordinates incrementX(int displacement);
    Coordinates incrementY(int displacement);
    Coordinates wrapInto(World world);
}
