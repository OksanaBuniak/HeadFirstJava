package excercises;

import java.util.ArrayList;

/**
 * Dima scared Oksana
 */
public class TicTacToe {
    private class Coord {
        private final int x;
        private final int y;
        private final Status status;

        private Coord(int x, int y) {
            this(x, y, Status.OPEN);
        }

        private Coord(int x, int y, Status status) {
            this.x = x;
            this.y = y;
            this.status = status;
        }

        int getX() {
            return x;
        }

        int getY() {
            return y;
        }

        Status getStatus() {
            return status;
        }
    }

    enum Status {
        OPEN,
        CLOSED
    }

    TicTacToe() {
        ArrayList<Coord> list = new ArrayList<>();

        list.add(new Coord(0, 1));
        list.add(new Coord(0, 6, Status.CLOSED));
        list.add(new Coord(5, 1));

        Coord coord = list.get(0);

        Status statusOfCurrentCell = coord.getStatus();
    }
}
