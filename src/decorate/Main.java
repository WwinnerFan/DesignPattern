package decorate;

public class Main {

    public static void main(String[] args) {
        Person man = new Man();
        ClothPerson cloth = new Cloth(man);
        cloth.dressed();
    }
}
