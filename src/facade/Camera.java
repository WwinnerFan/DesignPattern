package facade;

public class Camera implements ICamera {
    @Override
    public void open() {
        System.out.println("打开摄像头");
    }

    @Override
    public void close() {
        System.out.println("关闭摄像头");
    }
}
