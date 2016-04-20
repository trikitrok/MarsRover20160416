package com.dodevjutsu.kata.marsrover.rover_tests;

import com.dodevjutsu.kata.marsrover.Rover;
import org.junit.Test;

import static com.dodevjutsu.kata.marsrover.test_helpers.RoverBuilder.aRover;
import static com.dodevjutsu.kata.marsrover.test_helpers.RoverTestsHelpers.locatedAt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverMovingForward {
    @Test
    public void when_facing_north() {
        Rover rover = aRover().at(3, 6).facing("N").build();

        rover.receive("f");

        assertThat(rover, is(locatedAt(3, 7, "N")));
    }

    @Test
    public void when_facing_east() {
        Rover rover = aRover().at(1, 3).facing("E").build();

        rover.receive("f");

        assertThat(rover, is(locatedAt(2, 3, "E")));
    }

    @Test
    public void when_facing_south() {
        Rover rover = aRover().at(5, 3).facing("S").build();

        rover.receive("f");

        assertThat(rover, is(locatedAt(5, 2, "S")));
    }

    @Test
    public void when_facing_west() {
        Rover rover = aRover().at(9, 0).facing("W").build();

        rover.receive("f");

        assertThat(rover, is(locatedAt(8, 0, "W")));
    }

}
