package establish.abstractFactory.improvement;

import establish.abstractFactory.improvement.factory.BombedMazeFactory;
import establish.abstractFactory.improvement.factory.EnchantedMazeFactory;
import establish.abstractFactory.improvement.factory.MazeFactory;

public class Test {
    public static void main (String[] args) {
        System.out.println(MazeGame.createMaze(new MazeFactory()));
        System.out.println(MazeGame.createMaze(new EnchantedMazeFactory()));
        System.out.println(MazeGame.createMaze(new BombedMazeFactory()));
    }
}
