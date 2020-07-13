package establish;

/**
 * 东西南北方位的枚举类
 */
public enum Direction {
    North(0),
    South(1),
    East(2),
    West(3);
    private int index;

    Direction(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
