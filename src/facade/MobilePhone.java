package facade;

public class MobilePhone {

    public ICall call;
    public ICamera camera;

    public MobilePhone(){
        this.call = new Call();
        this.camera = new Camera();
    }

    public void call() {
        call.call();
        call.hangUp();
    }

    public void videoCall() {
        System.out.println("视频电话中");
        call.call();
        camera.open();
        camera.close();
        call.hangUp();
    }
}
