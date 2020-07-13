package establish.abstractFactory.csdn;

import establish.abstractFactory.csdn.factory.DellStorageFactory;
import establish.abstractFactory.csdn.factory.HuaWeiStorageFactory;
import establish.abstractFactory.csdn.factory.StorageFactory;

public class Client {
    /**
     * 获取具体工厂
     * @param name
     * @return
     */
    public static StorageFactory getFactory(String name) {
        if ("Dell".equals(name)) {
            return new DellStorageFactory();
        } else if ("HuaWei".equals(name)) {
            return new HuaWeiStorageFactory();
        }
        return null;
    }
}
