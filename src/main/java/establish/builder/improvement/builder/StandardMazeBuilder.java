package establish.builder.improvement.builder;

import establish.*;

/**
 * 用于构建迷宫的生成器
 */
public class StandardMazeBuilder extends MazeBuilder {
    private Maze currentMaze;

    public StandardMazeBuilder() {
        this.currentMaze = null;
    }

    /**
     * 根据传入的两个房间判断开门方向
     * @param r1
     * @param r2
     * @return
     */
    private Direction commonWall(Room r1, Room r2) {
        // 模拟判断开门方向
        return Direction.North;
    }
    // 构建迷宫
    @Override
    public void builderMaze() {
        currentMaze = new Maze();
    }
    // 构建房间
    @Override
    public void builderRoom(int room) {
        if (currentMaze.roomNo(room) == null) {
            Room r = new Room(room);
            currentMaze.addRoom(r);

            r.setSide(Direction.North, new Wall());
            r.setSide(Direction.East, new Wall());
            r.setSide(Direction.South, new Wall());
            r.setSide(Direction.West, new Wall());

        }
    }

    // 传入两个房间号，构建两个房间之间的门
    @Override
    public void builderDoor(int roomFrom, int roomTo) {
        Room r1 = currentMaze.roomNo(roomFrom);
        Room r2 = currentMaze.roomNo(roomTo);

        Door d = new Door(r1,r2);
        r1.setSide(commonWall(r1,r2),d);
        r2.setSide(commonWall(r2,r1),d);
    }

    // 重写返回迷宫
    @Override
    public Maze getMaze() {
        return currentMaze;
    }
}
