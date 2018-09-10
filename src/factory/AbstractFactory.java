package factory;

public abstract class AbstractFactory {

    public abstract <T extends Computer> T createComputer(Class<T> clazz);
}
