package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static com.dodevjutsu.kata.marsrover.RoverTestsHelpers.aRoverAt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverMovingBackwardTest {
    @Test
    public void when_facing_north() {
        Rover rover = aRoverAt(1, 5, "N");

        rover.receive("b");

        assertThat(rover, is(aRoverAt(1, 4, "N")));
    }

    @Test
    public void when_facing_east() {
        Rover rover = aRoverAt(1, 5, "E");

        rover.receive("b");

        assertThat(rover, is(aRoverAt(0, 5, "E")));
    }
}
