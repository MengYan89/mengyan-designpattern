package establish.abstractFactory.examples;

import establish.abstractFactory.examples.factory.MotifWidgetFactory;
import establish.abstractFactory.examples.factory.PMWidgetFactory;
import establish.abstractFactory.examples.factory.WidgetFactory;
import establish.abstractFactory.examples.product.ScrollBar;
import establish.abstractFactory.examples.product.Window;

/**
 * 客户端调用
 */
public class Client {
    private WidgetFactory factory;

    public Client(String name) {
        if ("Motif".equals(name)) {
            factory = new MotifWidgetFactory();
        } else if ("PM".equals(name)) {
            factory = new PMWidgetFactory();
        }
    }

    public Window getWindow() {
        return factory.createWindow();
    }

    public ScrollBar getScrollBar() {
        return factory.createScrollBar();
    }

}
