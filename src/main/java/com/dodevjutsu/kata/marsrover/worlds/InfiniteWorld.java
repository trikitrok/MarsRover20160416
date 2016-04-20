package com.dodevjutsu.kata.marsrover.worlds;

import com.dodevjutsu.kata.marsrover.Coordinates;
import com.dodevjutsu.kata.marsrover.World;

public class InfiniteWorld implements World {
    @Override
    public Coordinates wrap(Coordinates coordinates) {
        return coordinates;
    }
}
