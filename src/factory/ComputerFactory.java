package factory;

import java.lang.reflect.InvocationTargetException;

public class ComputerFactory extends AbstractFactory {



    @Override
    public <T extends Computer> T createComputer(Class<T> clazz) {
        Computer computer = null;
        String className = clazz.getName();

        try {
            computer = (Computer) Class.forName(className).getDeclaredConstructor().newInstance();
            System.out.println(Class.forName(className).getDeclaredConstructor().toString());
            // 与顺序有关
            System.out.println(Class.forName(className).getDeclaredConstructors()[0]);
            // 根据参数类型获取构造方法
            System.out.println(Class.forName(className).getDeclaredConstructor(String.class));
        } catch (Exception e) {

        }
        return (T) computer;
    }
}
