package establish.builder.improvement.builder;

import establish.Maze;

/**
 * 构建迷宫对象的抽象接口
 * 这里可以使用接口也可以使用抽象类
 */
public abstract class MazeBuilder {
    // 构建迷宫
    public abstract void builderMaze();
    // 构建房间
    public abstract void builderRoom(int room);
    // 构建门
    public abstract void builderDoor(int roomFrom, int roomTo);
    // 返回迷宫，默认实现返回null
    public Maze getMaze(){
        return null;
    }
}
