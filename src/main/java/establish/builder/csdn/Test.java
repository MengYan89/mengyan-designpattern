package establish.builder.csdn;

import establish.builder.csdn.builder.MacComputerBuilder;
import establish.builder.csdn.builder.WindowsComputerBuilder;

public class Test {
    public static void main(String[] args) {
        WindowsComputerBuilder windowsComputerBuilder = new WindowsComputerBuilder();
        MacComputerBuilder macComputerBuilder = new MacComputerBuilder();
        ComputerDirector director = new ComputerDirector();
        Computer mac = director.createComputer(macComputerBuilder);
        System.out.println(director.createComputer(macComputerBuilder));
        System.out.println(director.createComputer(windowsComputerBuilder));
    }
}
