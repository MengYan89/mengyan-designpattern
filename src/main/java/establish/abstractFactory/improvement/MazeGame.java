package establish.abstractFactory.improvement;

import establish.*;
import establish.abstractFactory.improvement.factory.MazeFactory;

/**
 * Client
 */
public class MazeGame {
    public static Maze createMaze(MazeFactory factory) {
        Maze aMaze = factory.makeMaze();
        Room r1 = factory.makeRoom(1);
        Room r2 = factory.makeRoom(2);
        Door theDoor = factory.makeDoor(r1,r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.North, factory.makeWall());
        r1.setSide(Direction.East, theDoor);
        r1.setSide(Direction.South, factory.makeWall());
        r1.setSide(Direction.West, factory.makeWall());

        r2.setSide(Direction.North, factory.makeWall());
        r2.setSide(Direction.East, factory.makeWall());
        r2.setSide(Direction.South, factory.makeWall());
        r2.setSide(Direction.West, theDoor);
        return aMaze;
    }
}
