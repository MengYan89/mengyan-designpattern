package establish.abstractFactory.improvement.product;

import establish.Room;

/**
 * 被施加魔法的屋子
 */
public class EnchantedRoom extends Room {
    protected Spell spell;
    public EnchantedRoom(Integer roomNumber, Spell spell) {
        super(roomNumber);
        this.spell = spell;
    }

    @Override
    public String toString() {
        return "EnchantedRoom{" +
                "spell=" + spell +
                "}:"+ super.toString();
    }
}
