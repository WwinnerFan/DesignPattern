package facade;

public class Call implements ICall {
    @Override
    public void call() {
        System.out.println("拨通电话");
    }

    @Override
    public void hangUp() {
        System.out.println("挂断电话");
    }
}
