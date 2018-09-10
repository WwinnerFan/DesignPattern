package factory;

public class Main {

    public static void main(String[] args) {

//        SimpleFactory.createComputer("asus").start();
        AbstractFactory factory = new ComputerFactory();
        AsusComputer asusComputer = factory.createComputer(AsusComputer.class);
        asusComputer.start();
    }
}
