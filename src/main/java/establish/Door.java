package establish;

/**
 * 对象门
 */
public class Door extends MapSite {
    private Room room1;
    private Room room2;
    private boolean isOpen;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public void enter() {

    }
    public Room OtherSideFrom(Room r) {
        return null;
    }
}
