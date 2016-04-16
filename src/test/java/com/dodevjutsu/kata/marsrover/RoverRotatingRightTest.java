package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static com.dodevjutsu.kata.marsrover.RoverTestsHelpers.aRoverAt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverRotatingRightTest {

    @Test
    public void when_facing_north() {
        Rover rover = aRoverAt(0, 0, "N");

        rover.receive("r");

        assertThat(rover, is(aRoverAt(0, 0, "E")));
    }

    @Test
    public void when_facing_east() {
        Rover rover = aRoverAt(0, 0, "E");

        rover.receive("r");

        assertThat(rover, is(aRoverAt(0, 0, "S")));
    }
}
