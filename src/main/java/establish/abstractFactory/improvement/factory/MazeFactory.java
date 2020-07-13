package establish.abstractFactory.improvement.factory;

import establish.Door;
import establish.Maze;
import establish.Room;
import establish.Wall;

public class MazeFactory {

    public Maze makeMaze() {
        return new Maze();
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Room makeRoom(Integer n) {
        return new Room(n);
    }

    public Door makeDoor(Room r1, Room r2) {
        return new Door(r1,r2);
    }
}
