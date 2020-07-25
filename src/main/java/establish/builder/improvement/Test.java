package establish.builder.improvement;

import establish.Maze;
import establish.builder.improvement.builder.CountingMazeBuilder;
import establish.builder.improvement.builder.StandardMazeBuilder;

public class Test {
    public static void main (String[] args) {
        MazeGame mazeGame = new MazeGame();
        // 迷宫Builder的使用
        Maze maze = mazeGame.createMaze(new StandardMazeBuilder());
        System.out.println(maze);
        // 计数器Builder的使用
        CountingMazeBuilder builder = (CountingMazeBuilder) mazeGame.builder(new CountingMazeBuilder());
        System.out.println(builder.getCounts());

    }
}
