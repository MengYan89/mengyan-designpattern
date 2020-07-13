package establish.abstractFactory.improvement.product;

import establish.Room;

/**
 * 携带炸弹的房间
 */
public class RoomWithABomb extends Room {
    public RoomWithABomb(Integer roomNumber) {
        super(roomNumber);
    }

    @Override
    public String toString() {
        return "RoomWithABomb:"+super.toString();
    }
}
