package stragety;

public class Main {

    public static void main(String[] args) {

        Stragety stragety = new BusStragety();
        TrafficContext trafficContext = new TrafficContext();
        trafficContext.setStragety(stragety);
        trafficContext.calculatePrice(1000);
    }
}
