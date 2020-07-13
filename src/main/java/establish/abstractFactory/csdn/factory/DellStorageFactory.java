package establish.abstractFactory.csdn.factory;

import establish.abstractFactory.csdn.product.Charger;
import establish.abstractFactory.csdn.product.DellCharger;
import establish.abstractFactory.csdn.product.DellNoteBook;
import establish.abstractFactory.csdn.product.NoteBook;

/**
 * 戴尔库房(具体工厂)
 */
public class DellStorageFactory extends StorageFactory {
    /**
     * 获得戴尔充电器
     * @return
     */
    public Charger createCharger() {
        return new DellCharger();
    }

    /**
     * 获得戴尔笔记本
     * @return
     */
    public NoteBook createNoteBook() {
        return new DellNoteBook();
    }
}
