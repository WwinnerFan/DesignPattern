package builder;

public class Cook {

    private FoodBuilder foodBuilder;

    public void setFoodBuilder(FoodBuilder foodBuilder){

        this.foodBuilder = foodBuilder;
    }

    public Food cook(){

        if (foodBuilder != null){

            return foodBuilder.getFood();
        }

        return null;
    }
}
