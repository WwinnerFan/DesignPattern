package single;

public class HungrySingleInstance {

    private static HungrySingleInstance instance = new HungrySingleInstance();

    private HungrySingleInstance(){}

    public static HungrySingleInstance getInstance(){

        return instance;
    }
}
