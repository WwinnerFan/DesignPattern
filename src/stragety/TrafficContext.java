package stragety;

public class TrafficContext {

    Stragety stragety;

    public void setStragety(Stragety stragety) {
        this.stragety = stragety;
    }

    public int calculatePrice(int km) {

        return  stragety.calculatePrice(km);
    }

}
