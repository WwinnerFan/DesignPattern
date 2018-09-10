package observer.implement;

import observer.interfaces.Observer;

public class SecondObserver implements Observer {

    private String message = null;
    private String name = "Second";
    @Override
    public void update(String message) {
        this.message = message;
        System.out.println(name + message);
    }

    @Override
    public void update(int n) {

    }
}
