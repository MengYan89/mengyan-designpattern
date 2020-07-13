package establish.abstractFactory.csdn.product;

/**
 * 华为充电器(具体产品)
 */
public class HuaWeiCharger implements Charger {
    public void getCharger() {
        System.out.println("获取华为充电器");
    }
}
