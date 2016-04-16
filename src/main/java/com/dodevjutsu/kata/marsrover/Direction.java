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

        @Override
        public Direction rotateLeft() {
            return WEST;
        }
    }, SOUTH {
        @Override
        public Coordinates move(Coordinates coordinates, int displacement) {
            return coordinates.add(new Coordinates(0, -displacement));
        }

        @Override
        public Direction rotateRight() {
            return Direction.WEST;
        }

        @Override
        public Direction rotateLeft() {
            return EAST;
        }

    }, EAST {
        @Override
        public Coordinates move(Coordinates coordinates, int displacement) {
            return coordinates.add(new Coordinates(displacement, 0));
        }

        @Override
        public Direction rotateRight() {
            return Direction.SOUTH;
        }

        @Override
        public Direction rotateLeft() {
            return NORTH;
        }
    }, WEST {
        @Override
        public Coordinates move(Coordinates coordinates, int displacement) {
            return coordinates.add(new Coordinates(-displacement, 0));
        }

        @Override
        public Direction rotateRight() {
            return Direction.NORTH;
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
    abstract public Direction rotateRight();

    public Direction rotateLeft() {
        return SOUTH;
    }
}
