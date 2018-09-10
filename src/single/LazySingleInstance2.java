package single;

public class LazySingleInstance2 {

    private static LazySingleInstance2 instance;

    private LazySingleInstance2() {}

    public static synchronized LazySingleInstance2 getInstance() {

        if (instance == null) {
            instance = new LazySingleInstance2();
        }

        return instance;
    }
}
