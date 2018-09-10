package single;

public class StaticSingleInstance {


    private StaticSingleInstance(){
    }

    public static StaticSingleInstance getInstance(){
        return InstanceHolder.instance;
    }


    private static class InstanceHolder{
        private static final StaticSingleInstance instance = new StaticSingleInstance();
    }
}
