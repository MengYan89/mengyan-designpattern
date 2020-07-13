package establish.abstractFactory.examples.product;

/**
 * Presentation Manager风格窗滚动条
 */
public class PMScrollBar implements ScrollBar {
    public void create() {
        System.out.println("create Presentation Manager ScrollBar");
    }
}
