package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static com.dodevjutsu.kata.marsrover.RoverTestsHelpers.aRoverAt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverReceivingCommandsSequenceTest {
    @Test
    public void not_moving_when_receiving_an_empty_commands_sequence() {
        Rover rover = aRoverAt(1, 3, "N");

        rover.receive("");

        assertThat(rover, is(aRoverAt(1, 3, "N")));
    }

    @Test
    public void receiving_a_sequence_with_several_commands() {
        Rover rover = aRoverAt(0, 0, "S");

        rover.receive("lflbrf");

        assertThat(rover, is(aRoverAt(2, -1, "E")));
    }
}
