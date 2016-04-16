import com.dodevjutsu.kata.marsrover.Rover;

import com.dodevjutsu.kata.marsrover.RoverTestsHelpers;
import org.junit.Test;

import static com.dodevjutsu.kata.marsrover.RoverBuilder.aRover;
import static com.dodevjutsu.kata.marsrover.RoverTestsHelpers.aRoverAt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverMovingForwardTest {
    @Test
    public void when_facing_north() {
        Rover rover = aRover().at(3, 6).facing("N").build();

        rover.receive("f");

        assertThat(rover, is(aRoverAt(3, 7, "N")));
    }

    @Test
    public void when_facing_east() {
        Rover rover = aRover().at(1, 3).facing("E").build();

        rover.receive("f");

        assertThat(rover, is(aRoverAt(2, 3, "E")));
    }

    @Test
    public void when_facing_south() {
        Rover rover = aRover().at(5, 3).facing("S").build();

        rover.receive("f");

        assertThat(rover, is(aRoverAt(5, 2, "S")));
    }

    @Test
    public void when_facing_west() {
        Rover rover = aRover().at(9, 0).facing("W").build();

        rover.receive("f");

        assertThat(rover, is(aRoverAt(8, 0, "W")));
    }

}
