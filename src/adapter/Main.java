package adapter;

public class Main {

    public static void main(String[] args) {
        VoltAdapter voltAdapter = new VoltAdapter();
        ObjectVoltAdapter objectVoltAdapter = new ObjectVoltAdapter(new Volt220());
    }
}
