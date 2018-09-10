package factory;

public class SimpleFactory  {

    public static Computer createComputer(String type) {

        Computer computer = null;
        switch(type) {

            case "asus":
                computer = new AsusComputer();
                break;
        }

        return computer;
    }
}
