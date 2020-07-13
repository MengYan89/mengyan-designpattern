package establish.abstractFactory.csdn.factory;

import establish.abstractFactory.csdn.product.Charger;
import establish.abstractFactory.csdn.product.HuaWeiCharger;
import establish.abstractFactory.csdn.product.HuaWeiNoteBook;
import establish.abstractFactory.csdn.product.NoteBook;

/**
 * 华为库房(具体工厂)
 */
public class HuaWeiStorageFactory extends StorageFactory {
    /**
     * 获得华为充电器
     * @return
     */
    public Charger createCharger() {
        return new HuaWeiCharger();
    }

    /**
     * 获得华为笔记本
     * @return
     */
    public NoteBook createNoteBook() {
        return new HuaWeiNoteBook();
    }
}
