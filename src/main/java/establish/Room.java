package establish;

import java.util.Arrays;

/**
 * Room是MapSite的一个具体的子类，而MapSite定义了迷宫中构件之间的主要关系。
 * Room有指向其他MapSite对象的引用，并保存一个房间号，这个数字用来标识迷宫中的房间。
 */
public class Room extends MapSite{
    private Integer roomNumber;

    private MapSite[] sides = new MapSite[4];

    public Room(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void enter() {

    }

    public MapSite getSide(Direction d) {
        return null;
    }

    public void setSide(Direction d, MapSite m) {
        sides[d.getIndex()] = m;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", sides=" + Arrays.toString(sides) +
                '}';
    }
}
