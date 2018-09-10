package decorate;

public class Cloth extends ClothPerson {


    public Cloth(Person person) {
        super(person);
    }

    @Override
    public void dressed() {
        super.dressed();
        System.out.println("穿衣服");
    }
}
