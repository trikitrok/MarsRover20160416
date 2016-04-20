package com.dodevjutsu.kata.marsrover.rover_tests;

import com.dodevjutsu.kata.marsrover.Direction;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DirectionsCreation {

    @Test
    public void direction_pointing_north(){
        MatcherAssert.assertThat(Direction.pointingTo("N"), is(Direction.NORTH));
    }

    @Test
    public void direction_pointing_south() {
        assertThat(Direction.pointingTo("S"), is(Direction.SOUTH));
    }

    @Test
    public void direction_pointing_east() {
        assertThat(Direction.pointingTo("E"), is(Direction.EAST));
    }

    @Test
    public void direction_pointing_west() {
        assertThat(Direction.pointingTo("W"), is(Direction.WEST));
    }
}
