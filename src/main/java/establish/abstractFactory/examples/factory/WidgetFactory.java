package establish.abstractFactory.examples.factory;

import establish.abstractFactory.examples.product.ScrollBar;
import establish.abstractFactory.examples.product.Window;

/**
 * 界面组件工厂的抽象类
 */
public abstract class WidgetFactory {
    public abstract Window createWindow();
    public abstract ScrollBar createScrollBar();

}
