package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverTest {
    @Test
    public void not_moving_when_receiving_an_empty_commands_sequence() {
        Rover rover = new Rover(1, 3, "N");

        rover.receive("");

        assertThat(rover, is(new Rover(1, 3, "N")));
    }

    @Test
    public  void moving_forward_when_facing_north() {
        Rover rover = new Rover(3, 6, "N");

        rover.receive("f");

        assertThat(rover, is(new Rover(3, 7, "N")));
    }
}
