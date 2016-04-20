package com.dodevjutsu.kata.marsrover.rover_tests;

import com.dodevjutsu.kata.marsrover.Rover;
import org.junit.Test;

import static com.dodevjutsu.kata.marsrover.test_helpers.RoverBuilder.aRover;
import static com.dodevjutsu.kata.marsrover.test_helpers.RoverTestsHelpers.locatedAt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverReceivingSequenceOfCommands {
    @Test
    public void not_moving_when_receiving_an_empty_commands_sequence() {
        Rover rover = aRover().at(1, 3).facing("N").build();

        rover.receive("");

        assertThat(rover, is(locatedAt(1, 3, "N")));
    }

    @Test
    public void receiving_a_sequence_with_several_commands() {
        Rover rover = aRover().at(0, 0).facing("S").build();

        rover.receive("lflbrf");

        assertThat(rover, is(locatedAt(2, -1, "E")));
    }

    @Test
    public void receiving_a_sequence_with_an_unknown_command() {
        Rover rover = aRover().at(0, 4).facing("S").build();

        rover.receive("*");

        assertThat(rover, is(locatedAt(0, 4, "S")));
    }
}
