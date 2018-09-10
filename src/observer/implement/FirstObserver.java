package observer.implement;

import observer.interfaces.Observer;

public class FirstObserver implements Observer {

    private String message = null;
    private String name = "First";
    private int a = 2, b = 1;

    public FirstObserver(){}
    @Override
    public void update(String message) {
        this.message = message;
        System.out.println(name + message);
    }

    @Override
    public void update(int n) {
        a = n;
        System.out.println(a + b);
    }
}
