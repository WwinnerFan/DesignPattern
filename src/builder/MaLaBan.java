package builder;

public class MaLaBan implements Food{

    private String name = "";
    private boolean isSpicy = false;
    private int amount = 10;
    private String addition = "soup";

    public void beEaten(){

        System.out.println(name + "is eaten");
    }

    static class MalaBanBuilder extends FoodBuilder{

        MaLaBan maLaBan = new MaLaBan();

        @Override
        FoodBuilder setFoodName(String name) {
            maLaBan.name = name;
            return this;
        }

        @Override
        FoodBuilder setSpicyDegree(boolean isSpicy) {

            maLaBan.isSpicy = isSpicy;

            return this;
        }

        @Override
        FoodBuilder setAmount(int amount) {

            maLaBan.amount = amount;

            return this;
        }

        @Override
        FoodBuilder setAddition(String addition) {
            maLaBan.addition = addition;

            return this;
        }

        @Override
        Food getFood() {
            return maLaBan;
        }
    }

}
