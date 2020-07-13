package establish.abstractFactory.examples.product;

/**
 * Presentation Manager风格窗口
 */
public class PMWindow implements Window {
    public void create() {
        System.out.println("create Presentation Manager Window");
    }
}
