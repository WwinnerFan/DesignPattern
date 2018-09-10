package builder;

public abstract class FoodBuilder {

    abstract FoodBuilder setFoodName(String name);
    abstract FoodBuilder setSpicyDegree (boolean isSpicy);
    abstract FoodBuilder setAmount(int amount);
    abstract FoodBuilder setAddition(String addition);
    abstract Food getFood();
}
