package establish.abstractFactory.improvement.factory;

import establish.Door;
import establish.Room;
import establish.abstractFactory.improvement.product.DoorNeedingSpell;
import establish.abstractFactory.improvement.product.EnchantedRoom;
import establish.abstractFactory.improvement.product.Spell;

/**
 * 施加了魔法的迷宫的工厂
 */
public class EnchantedMazeFactory extends MazeFactory {

    @Override
    public Room makeRoom(Integer n) {
        return new EnchantedRoom(n, castSpell());
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }

    protected Spell castSpell() {
        return new Spell();
    }
}
