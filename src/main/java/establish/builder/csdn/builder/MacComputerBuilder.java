package establish.builder.csdn.builder;

import establish.builder.csdn.Computer;

/**
 * Mac电脑Builder
 */
public class MacComputerBuilder implements ComputerBuilder {
    private Computer computer;
    public void builderComputer() {
        this.computer = new Computer();
    }

    public void builderSystem() {
        this.computer.setSystem("Mac OS");
    }

    public void builderBox() {
        this.computer.setBox("Mac box");

    }

    public void builderScreen() {
        this.computer.setScreen("Mac screen");

    }

    public Computer getComputer() {
        return this.computer;
    }
}
