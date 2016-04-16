package com.dodevjutsu.kata.marsrover;

public enum Direction {
    NORTH {
        @Override
        public Coordinates move(Coordinates coordinates, int displacement) {
            return coordinates.add(new Coordinates(0, displacement));
        }

        @Override
        public Direction rotateRight() {
            return Direction.EAST;
        }
    }, SOUTH {
        @Override
        public Coordinates move(Coordinates coordinates, int displacement) {
            return coordinates.add(new Coordinates(0, -displacement));
        }
    }, EAST {
        @Override
        public Coordinates move(Coordinates coordinates, int displacement) {
            return coordinates.add(new Coordinates(displacement, 0));
        }
    }, WEST {
        @Override
        public Coordinates move(Coordinates coordinates, int displacement) {
            return coordinates.add(new Coordinates(-displacement, 0));
        }
    };

    public static Direction pointingTo(String directionCode) {
        if (directionCode.equals("N")) {
            return NORTH;
        } else if (directionCode.equals("S")) {
            return SOUTH;
        } else if (directionCode.equals("E")) {
            return EAST;
        } else {
            return WEST;
        }
    }

    abstract public Coordinates move(Coordinates coordinates, int displacement);

    public Direction rotateRight() {
        return Direction.SOUTH;
    }
}
