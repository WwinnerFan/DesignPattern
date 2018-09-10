package single;

/**
 * 线程不安全
 */
public class LazySingleInstance {

    private static LazySingleInstance instance;

    public static LazySingleInstance getInstance() {

        if (instance == null) {
            instance = new LazySingleInstance();
        }

        return instance;
    }
}
