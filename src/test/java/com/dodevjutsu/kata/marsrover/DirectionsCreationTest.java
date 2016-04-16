package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DirectionsCreationTest {

    @Test
    public void direction_pointing_north(){
        assertThat(Direction.pointingTo("N"), is(Direction.NORTH));
    }

    @Test
    public void direction_pointing_south() {
        assertThat(Direction.pointingTo("S"), is(Direction.SOUTH));
    }
}
