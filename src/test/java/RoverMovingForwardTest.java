import com.dodevjutsu.kata.marsrover.Rover;

import com.dodevjutsu.kata.marsrover.RoverTestsHelpers;
import org.junit.Test;

import static com.dodevjutsu.kata.marsrover.RoverTestsHelpers.aRoverAt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverMovingForwardTest {
    @Test
    public void when_facing_north() {
        Rover rover = aRoverAt(3, 6, "N");

        rover.receive("f");

        assertThat(rover, is(aRoverAt(3, 7, "N")));
    }

    @Test
    public void when_facing_east() {
        Rover rover = aRoverAt(1, 3, "E");

        rover.receive("f");

        assertThat(rover, is(aRoverAt(2, 3, "E")));
    }

    @Test
    public void when_facing_south() {
        Rover rover = aRoverAt(5, 3, "S");

        rover.receive("f");

        assertThat(rover, is(aRoverAt(5, 2, "S")));
    }

    @Test
    public void when_facing_west() {
        Rover rover = aRoverAt(9, 0, "W");

        rover.receive("f");

        assertThat(rover, is(aRoverAt(8, 0, "W")));
    }

}
