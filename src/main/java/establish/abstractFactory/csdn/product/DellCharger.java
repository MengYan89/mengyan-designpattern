package establish.abstractFactory.csdn.product;

/**
 * Dell充电器(具体产品)
 */
public class DellCharger implements Charger {
    public void getCharger() {
        System.out.println("获取Dell充电器");
    }
}
