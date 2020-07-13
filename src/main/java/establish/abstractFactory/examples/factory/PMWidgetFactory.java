package establish.abstractFactory.examples.factory;

import establish.abstractFactory.examples.product.PMScrollBar;
import establish.abstractFactory.examples.product.PMWindow;
import establish.abstractFactory.examples.product.ScrollBar;
import establish.abstractFactory.examples.product.Window;

/**
 * Presentation Manager风格组件工厂类
 */
public class PMWidgetFactory extends WidgetFactory{
    public Window createWindow() {
        return new PMWindow();
    }

    public ScrollBar createScrollBar() {
        return new PMScrollBar();
    }
}
