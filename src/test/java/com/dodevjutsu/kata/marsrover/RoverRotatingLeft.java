package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static com.dodevjutsu.kata.marsrover.RoverBuilder.aRover;
import static com.dodevjutsu.kata.marsrover.test_helpers.RoverTestsHelpers.locatedAt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverRotatingLeft {
    @Test
    public void when_facing_north() {
        Rover rover = aRover().at(0, 0).facing("N").build();

        rover.receive("l");

        assertThat(rover, is(locatedAt(0, 0, "W")));
    }

    @Test
    public void when_facing_east() {
        Rover rover = aRover().at(0, 0).facing("E").build();

        rover.receive("l");

        assertThat(rover, is(locatedAt(0, 0, "N")));
    }

    @Test
    public void when_facing_south() {
        Rover rover = aRover().at(0, 0).facing("S").build();

        rover.receive("l");

        assertThat(rover, is(locatedAt(0, 0, "E")));
    }

    @Test
    public void when_facing_west() {
        Rover rover = aRover().at(0, 0).facing("W").build();

        rover.receive("l");

        assertThat(rover, is(locatedAt(0, 0, "S")));
    }
}
