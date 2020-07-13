package establish;

import java.util.HashMap;

/**
 * 房间集合
 */
public class Maze {
    private HashMap<Integer,Room> roomHash;
    public Maze() {
        roomHash = new HashMap<Integer, Room>();
    }

    public void addRoom(Room r){
        roomHash.put(r.getRoomNumber(), r);
    }

    public Room roomNo(int index) {
        return null;
    }

    @Override
    public String toString() {
        return roomHash.toString();
    }
}
