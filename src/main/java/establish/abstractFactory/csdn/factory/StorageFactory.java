package establish.abstractFactory.csdn.factory;

import establish.abstractFactory.csdn.product.Charger;
import establish.abstractFactory.csdn.product.NoteBook;

/**
 * 库房(抽象工厂)
 */
public abstract class StorageFactory {
    //获取充电器
    public abstract Charger createCharger();
    //获取笔记本
    public abstract NoteBook createNoteBook();
}
