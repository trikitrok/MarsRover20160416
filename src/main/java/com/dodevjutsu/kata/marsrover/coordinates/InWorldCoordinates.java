package com.dodevjutsu.kata.marsrover.coordinates;

import com.dodevjutsu.kata.marsrover.Coordinates;
import com.dodevjutsu.kata.marsrover.World;

public class InWorldCoordinates implements Coordinates {
    private final Coordinates coordinates;
    private final World world;

    public InWorldCoordinates(Coordinates coordinates, World world) {
        this.coordinates = coordinates;
        this.world = world;
    }

    @Override
    public Coordinates incrementX(int displacement) {
        return wrapCoordinates(coordinates.incrementX(displacement));
    }

    @Override
    public Coordinates incrementY(int displacement) {
        return wrapCoordinates(coordinates.incrementY(displacement));
    }

    @Override
    public Coordinates wrapInto(World world) {
        return new InWorldCoordinates(coordinates.wrapInto(world), world);
    }

    private Coordinates wrapCoordinates(Coordinates coordinates) {
        return new InWorldCoordinates(coordinates, world).wrapInto(world);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InWorldCoordinates)) return false;

        InWorldCoordinates that = (InWorldCoordinates) o;

        return coordinates != null ? coordinates.equals(that.coordinates) : that.coordinates == null;
    }

    @Override
    public int hashCode() {
        return coordinates != null ? coordinates.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "InWorldCoordinates{" +
            "coordinates=" + coordinates +
            '}';
    }
}
