package adapter;

public class VoltAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getFiveVolt() {
        return 5;
    }
}
