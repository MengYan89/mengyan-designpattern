package establish.abstractFactory.examples.factory;

import establish.abstractFactory.examples.product.MotifScrollBar;
import establish.abstractFactory.examples.product.MotifWindow;
import establish.abstractFactory.examples.product.ScrollBar;
import establish.abstractFactory.examples.product.Window;

/**
 * Motif风格组件工厂类
 */
public class MotifWidgetFactory extends WidgetFactory {

    public Window createWindow() {
        return new MotifWindow();
    }

    public ScrollBar createScrollBar() {
        return new MotifScrollBar();
    }
}
