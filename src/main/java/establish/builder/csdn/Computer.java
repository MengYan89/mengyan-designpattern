package establish.builder.csdn;

// 电脑
public class Computer {
    // 系统
    private String system;
    // 机箱
    private String box;
    // 屏幕
    private String screen;

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "system='" + system + '\'' +
                ", box='" + box + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
}
