package establish.builder.improvement.builder;

import java.util.HashMap;

/**
 * 用于计数的生成器
 * 记录不同组件的数量
 * 不创建迷宫
 */
public class CountingMazeBuilder extends MazeBuilder {

    // 组件计数器
    private HashMap<String,Integer> count;

    public CountingMazeBuilder() {
        this.count = new HashMap<String, Integer>();
        this.count.put("doors",0);
        this.count.put("rooms",0);
    }

    public void builderMaze() {
    }

    // 增加rooms计数器
    public void builderRoom(int room) {
        this.count.put("rooms",count.get("rooms")+1);
    }

    // 增加doors计数器
    public void builderDoor(int roomFrom, int roomTo) {
        this.count.put("doors",count.get("doors")+1);
    }

    public HashMap<String, Integer> getCounts() {
        return count;
    }
}
