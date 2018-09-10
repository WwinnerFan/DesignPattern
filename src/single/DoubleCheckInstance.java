package single;

public class DoubleCheckInstance {

    private volatile static DoubleCheckInstance instance;
    private DoubleCheckInstance(){}

    public static DoubleCheckInstance getInstance() {

        if (instance == null) {

            synchronized (DoubleCheckInstance.class) {
                instance = new DoubleCheckInstance();
            }
        }

        return instance;
    }
}
