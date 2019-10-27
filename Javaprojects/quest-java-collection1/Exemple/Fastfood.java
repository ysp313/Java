import java.util.*;

public class Fastfood {

    public static void main(String[] args) {

        Food burger = new Food("Big Wac", 450);
        Food fries = new Food("French fries", 275);
        Food cheeseburger = new Food("Cheeseburger", 300);
        Food sunday = new Food("Chocolate Sunday", 175);

        ArrayList<Food> lunch = new ArrayList<>();
        lunch.add(burger);       // index 0
        lunch.add(fries);        // index 1
        lunch.add(cheeseburger); // index 2
        lunch.add(sunday);       // index 3

        lunch.remove(1); // remove fries

        burger.setName("Double Cheese"); // modify burger outside the list

        Food milkshake = new Food("Vanilla Milkshake", 200);

        lunch.set(2, milkshake); // replace sunday with milkshake

        System.out.println("Lunch size: " + lunch.size());
        for (Food food : lunch) { // iterate though the list
            System.out.println(food.getName());
        }
    }
}