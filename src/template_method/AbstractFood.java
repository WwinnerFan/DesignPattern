package template_method;

public abstract class AbstractFood {

    protected abstract void buy();
    protected abstract void wash();
    protected abstract void cut();
    protected abstract void cooking();

//    该方法为final 为了防止算法框架被覆写

    public final void cook() {
        buy();
        wash();
        cut();
        cooking();
    }
}
