package com.dodevjutsu.kata.marsrover.worlds_tests;

import com.dodevjutsu.kata.marsrover.Coordinates;
import com.dodevjutsu.kata.marsrover.coordinates.FreeCoordinates;
import com.dodevjutsu.kata.marsrover.coordinates.InWorldCoordinates;
import com.dodevjutsu.kata.marsrover.World;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WrappingInWorldCoordinates {
    private World anyWorld;
    private Coordinates coordinates;
    private Coordinates coordinatesInWorld;
    private static final int ANY_DISPLACEMENT = 3;

    @Test
    public void in_a_world_coordinates_are_wrapped_when_its_x_is_incremented() {
        coordinatesInWorld.incrementX(ANY_DISPLACEMENT);

        verify(anyWorld).wrap(isA(Coordinates.class));
    }

    @Test
    public void in_a_world_coordinates_are_wrapped_when_its_y_is_incremented() {
        coordinatesInWorld.incrementY(ANY_DISPLACEMENT);

        verify(anyWorld).wrap(isA(Coordinates.class));
    }

    @Before
    public void setup() {
        anyWorld = mock(World.class);
        coordinates = new FreeCoordinates(1, 3);
        coordinatesInWorld = new InWorldCoordinates(coordinates, anyWorld);
    }
}
