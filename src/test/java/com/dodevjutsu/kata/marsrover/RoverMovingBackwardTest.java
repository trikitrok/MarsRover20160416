package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static com.dodevjutsu.kata.marsrover.RoverBuilder.aRover;
import static com.dodevjutsu.kata.marsrover.RoverTestsHelpers.aRoverAt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverMovingBackwardTest {
    @Test
    public void when_facing_north() {
        Rover rover = aRover().at(1, 5).facing("N").build();

        rover.receive("b");

        assertThat(rover, is(aRoverAt(1, 4, "N")));
    }

    @Test
    public void when_facing_east() {
        Rover rover = aRover().at(1, 5).facing("E").build();

        rover.receive("b");

        assertThat(rover, is(aRoverAt(0, 5, "E")));
    }

    @Test
    public void when_facing_south() {
        Rover rover = aRover().at(1, 5).facing("S").build();

        rover.receive("b");

        assertThat(rover, is(aRoverAt(1, 6, "S")));
    }

    @Test
    public void when_facing_west() {
        Rover rover = aRover().at(3, 5).facing("W").build();

        rover.receive("b");

        assertThat(rover, is(aRoverAt(4, 5, "W")));
    }
}
