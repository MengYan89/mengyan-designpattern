package establish.builder.improvement;

import establish.Maze;
import establish.builder.improvement.builder.MazeBuilder;

/**
 * 一个使用Builder接口的对象
 *
 */
public class MazeGame {
    // 返回Maze
    public Maze createMaze(MazeBuilder builder) {
        builder.builderMaze();
        builder.builderRoom(1);
        builder.builderRoom(2);
        builder.builderDoor(1,2);
        return builder.getMaze();
    }

    // 返回Builder
    public MazeBuilder builder(MazeBuilder builder) {
        builder.builderMaze();
        builder.builderRoom(1);
        builder.builderRoom(2);
        builder.builderDoor(1,2);
        return builder;
    }
}
