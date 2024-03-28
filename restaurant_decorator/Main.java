
public class Main {
    public static void main(String[] args) {

        LoyaltySystem loyaltySystem = new LoyaltySystem();

        System.out.println("--Order 1 with bronze loyalty discount--");
        Order order1 = new Order();
        FoodItem pizza = new BasicFoodItem("pizza", 10.00);
        pizza = new FoodWithTopping(pizza, "pepperoni", 0.25);
        pizza = new FoodWithTopping(pizza, "bacon", 0.25);
        order1.addItem(pizza);

        FoodItem chickenNuggets = new BasicFoodItem("chicken nuggets", 3.50);
        order1.addItem(chickenNuggets);

        FoodItem burger = new BasicFoodItem("burger", 5.00);
        burger = new FoodWithTopping(burger, "cheese", 0.25);
        burger = new FoodWithTopping(burger, "onions", 0.25);
        order1.addItem(burger);

        FoodItem hotdog = new BasicFoodItem("hotdog", 1.00);
        hotdog = new FoodWithTopping(hotdog, "ketchup", 0.0);
        hotdog = new FoodWithTopping(hotdog, "grilled onions", 0.25);
        order1.addItem(hotdog);

        order1.showOrder();
        loyaltySystem.showDiscountTotal(order1.getTotal(), "bronze");


        System.out.println("--Order 2 with silver loyalty discount--");
        Order order2 = new Order();
        FoodItem chillidog = new BasicFoodItem("hotdog", 1.00);
        chillidog = new FoodWithTopping(chillidog, "chilli", 1.00);
        order2.addItem(chillidog);

        FoodItem chickenSandwich = new BasicFoodItem("chicken sandwich", 5.00);
        chickenSandwich = new FoodWithTopping(chickenSandwich, "lettuce and tomato", 0.25);
        chickenSandwich = new FoodWithTopping(chickenSandwich, "pepper-jack cheese", 0.15);
        chickenSandwich = new FoodWithTopping(chickenSandwich, "bacon", 1.00);
        order2.addItem(chickenSandwich);

        order2.showOrder();
        loyaltySystem.showDiscountTotal(order2.getTotal(), "silver");


        System.out.println("--Order 3 with gold loyalty discount--");
        Order order3 = new Order();
        FoodItem loadedFries = new BasicFoodItem("french fries", 4.00);
        loadedFries = new FoodWithTopping(loadedFries, "nacho cheese", 0.75);
        loadedFries = new FoodWithTopping(loadedFries, "sour cream", 0.10);
        loadedFries = new FoodWithTopping(loadedFries, "steak", 2.00);
        loadedFries = new FoodWithTopping(loadedFries, "avocado", 1.00);
        loadedFries = new FoodWithTopping(loadedFries, "salsa", 0.50);
        order3.addItem(loadedFries);

        FoodItem baconHotdog = new BasicFoodItem("hot dog", 1.50);
        baconHotdog = new FoodWithTopping(baconHotdog, "bacon wrap", 0.75);
        baconHotdog = new FoodWithTopping(baconHotdog, "ketchup", 0.00);
        baconHotdog = new FoodWithTopping(baconHotdog, "onions", 0.15);
        order3.addItem(baconHotdog);

        FoodItem pretzelBurger = new BasicFoodItem("burger", 5.00);
        pretzelBurger = new FoodWithTopping(pretzelBurger, "pretzel bun", 1.00);
        pretzelBurger = new FoodWithTopping(pretzelBurger, "cheese dip", 1.00);
        pretzelBurger = new FoodWithTopping(pretzelBurger, "pickles", 0.20);
        order3.addItem(pretzelBurger);

        FoodItem waffleFries = new BasicFoodItem("waffle fries", 4.00);
        order3.addItem(waffleFries);
        order3.showOrder();
        loyaltySystem.showDiscountTotal(order3.getTotal(), "gold");
    }
}