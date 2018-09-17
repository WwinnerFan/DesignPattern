package adapter;

/**
 * 对象适配器模式
 */
public class ObjectVoltAdapter implements FiveVolt {

    Volt220 volt220;
    public ObjectVoltAdapter(Volt220 volt220) {
        this.volt220 = volt220;
    }
    @Override
    public int getFiveVolt() {
        return 5;
    }
}
