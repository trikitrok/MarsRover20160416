package com.dodevjutsu.kata.marsrover.worlds;

import com.dodevjutsu.kata.marsrover.World;

public class InfiniteWorld implements World {
    @Override
    public int wrapX(int x) {
        return x;
    }

    @Override
    public int wrapY(int y) {
        return y;
    }
}
