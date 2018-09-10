package decorate;

public abstract class ClothPerson extends Person{

    protected Person mPerson;
    public ClothPerson(Person person) {
        this.mPerson = person;
    }

    @Override
    void dressed() {
        mPerson.dressed();
    }
}
