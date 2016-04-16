package com.dodevjutsu.kata.marsrover;

public enum Direction {
    NORTH {
        @Override
        public Coordinates move(Coordinates coordinates, int displacement) {
            return coordinates.incrementY(displacement);
        }

        @Override
        public Direction rotateRight() {
            return EAST;
        }

        @Override
        public Direction rotateLeft() {
            return WEST;
        }
    }, SOUTH {
        @Override
        public Coordinates move(Coordinates coordinates, int displacement) {
            return coordinates.incrementY(-displacement);
        }

        @Override
        public Direction rotateRight() {
            return WEST;
        }

        @Override
        public Direction rotateLeft() {
            return EAST;
        }

    }, EAST {
        @Override
        public Coordinates move(Coordinates coordinates, int displacement) {
            return coordinates.incrementX(displacement);
        }

        @Override
        public Direction rotateRight() {
            return SOUTH;
        }

        @Override
        public Direction rotateLeft() {
            return NORTH;
        }
    }, WEST {
        @Override
        public Coordinates move(Coordinates coordinates, int displacement) {
            return coordinates.incrementX(-displacement);
        }

        @Override
        public Direction rotateRight() {
            return NORTH;
        }

        public Direction rotateLeft() {
            return SOUTH;
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
    abstract public Direction rotateLeft();
}
