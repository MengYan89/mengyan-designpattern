package establish.abstractFactory.improvement.factory;

import establish.Room;
import establish.Wall;
import establish.abstractFactory.improvement.product.BombedWall;
import establish.abstractFactory.improvement.product.RoomWithABomb;

/**
 * 携带炸弹的迷宫的工厂
 */
public class BombedMazeFactory extends MazeFactory {

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom(Integer n) {
        return new RoomWithABomb(n);
    }
}
