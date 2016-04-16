package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverTest {
    @Test
    public void not_moving_when_receiving_an_empty_commands_sequence() {
        Rover rover = aRoverAt(1, 3, "N");

        rover.receive("");

        assertThat(rover, is(aRoverAt(1, 3, "N")));
    }

    @Test
    public void moving_forward_when_facing_north() {
        Rover rover = aRoverAt(3, 6, "N");

        rover.receive("f");

        assertThat(rover, is(aRoverAt(3, 7, "N")));
    }

    @Test
    public void moving_forward_when_facing_east() {
        Rover rover = aRoverAt(1, 3, "E");

        rover.receive("f");

        assertThat(rover, is(aRoverAt(2, 3, "E")));
    }

    @Test
    public void moving_forward_when_facing_south() {
        Rover rover = aRoverAt(5, 3, "S");

        rover.receive("f");

        assertThat(rover, is(aRoverAt(5, 2, "S")));
    }

    @Test
    public void moving_forward_when_facing_west() {
        Rover rover = aRoverAt(9, 0, "W");

        rover.receive("f");

        assertThat(rover, is(aRoverAt(8, 0, "W")));
    }

    private Rover aRoverAt(int x, int y, String direction) {
        return new Rover(x, y, direction);
    }
}
