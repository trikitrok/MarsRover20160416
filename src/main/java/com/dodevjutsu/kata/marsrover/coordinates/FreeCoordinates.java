package com.dodevjutsu.kata.marsrover.coordinates;

import com.dodevjutsu.kata.marsrover.Coordinates;
import com.dodevjutsu.kata.marsrover.World;

public class FreeCoordinates implements Coordinates {
    private final int x;
    private final int y;

    public FreeCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates incrementX(int displacement) {
        return new FreeCoordinates(x + displacement, y);
    }

    public Coordinates incrementY(int displacement) {
        return new FreeCoordinates(x, y + displacement);
    }

    @Override
    public Coordinates wrapInto(World world) {
        return new FreeCoordinates(world.wrapX(x), world.wrapY(y));
    }

    @Override
    public String toString() {
        return "Coordinates{" +
            "x=" + x +
            ", y=" + y +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FreeCoordinates that = (FreeCoordinates) o;

        if (x != that.x) return false;
        return y == that.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
