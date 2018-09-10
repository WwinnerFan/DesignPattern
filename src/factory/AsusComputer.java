package factory;

public class AsusComputer extends Computer {


    public AsusComputer(String name) {

    }

    public AsusComputer() {}

    @Override
    public void start() {
        System.out.println("华硕电脑启动");
    }
}
