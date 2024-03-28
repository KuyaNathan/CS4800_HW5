import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RestaurantTest {
    @Test
    public void testGetTotal(){
        FoodItem baconCheeseBurger = new BasicFoodItem("burger", 3.50);
        baconCheeseBurger = new FoodWithTopping(baconCheeseBurger, "cheese", 1.00);

        FoodItem chilliDog = new BasicFoodItem("hotdog", 1.50);
        chilliDog = new FoodWithTopping(chilliDog, "chilli", 1.00);

        Order order = new Order();
        order.addItem(baconCheeseBurger);
        order.addItem(chilliDog);

        assertEquals(7.00, order.getTotal(), 0.01);
    }

    @Test
    public void testApplyLoyaltyDiscount(){
        LoyaltySystem loyaltySystem = new LoyaltySystem();

        assertEquals(27.46, loyaltySystem.applyLoyaltyDiscount(32.30, "gold"), 0.01);
    }

    @Test
    public void testAddItem(){
        Order order = new Order();
        FoodItem pizza = new BasicFoodItem("pizza", 8.00);
        order.addItem(pizza);

        assertEquals(pizza, order.getItems().get(0));
    }

    @Test
    public void testGetName(){
        FoodItem cheeseFries = new BasicFoodItem("fries", 3.25);
        cheeseFries = new FoodWithTopping(cheeseFries, "cheese", 1.00);

        assertEquals("fries + cheese", cheeseFries.getName());
    }
}
