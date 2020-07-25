package establish.builder.csdn.builder;

import establish.builder.csdn.Computer;

public class WindowsComputerBuilder implements ComputerBuilder {
    private Computer computer;
    public void builderComputer() {
        this.computer = new Computer();
    }

    public void builderSystem() {
        this.computer.setSystem("windows 10");
    }

    public void builderBox() {
        this.computer.setBox("diy box");

    }

    public void builderScreen() {
        this.computer.setScreen("diy screen");
    }

    public Computer getComputer() {
        return this.computer;
    }
}
