package establish.builder.csdn;

import establish.builder.csdn.builder.ComputerBuilder;

/**
 * 调用具体建造者角色以创建产品对象
 */
public class ComputerDirector {
    // 生成电脑
    public Computer createComputer(ComputerBuilder builder) {
        builder.builderComputer();
        builder.builderBox();
        builder.builderScreen();
        builder.builderSystem();
        return builder.getComputer();
    }
}
