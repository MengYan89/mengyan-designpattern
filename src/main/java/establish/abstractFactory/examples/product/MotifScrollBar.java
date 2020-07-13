package establish.abstractFactory.examples.product;

/**
 * Motif风格滚动条
 */
public class MotifScrollBar implements ScrollBar {
    public void create() {
        System.out.println("create Motif Window");
    }
}
