package establish.builder.csdn.builder;

import establish.builder.csdn.Computer;

/**
 * 电脑生成器接口
 */
public interface ComputerBuilder {
    void builderComputer();
    void builderSystem();
    void builderBox();
    void builderScreen();
    Computer getComputer();
}
