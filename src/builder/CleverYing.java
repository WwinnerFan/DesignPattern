package builder;

import java.util.Scanner;

public class CleverYing {

    public static void main(String[] args) {

        System.out.println("你的名字");
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());
        Cook cook = new Cook();

        FoodBuilder maLaBanBuilder = new MaLaBan
                .MalaBanBuilder()
                .setFoodName("Malaban")
                .setAmount(15)
                .setSpicyDegree(true)
                .setAddition("soup");
        cook.setFoodBuilder(maLaBanBuilder);
        MaLaBan maLaBan = (MaLaBan) cook.cook();
        maLaBan.beEaten();
    }


}
