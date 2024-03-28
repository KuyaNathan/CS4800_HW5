import java.util.List;
import java.util.ArrayList;

public class Order {
    private List<FoodItem> items = new ArrayList<>();

    public Order(){
    }

    public void addItem(FoodItem foodItem){
        items.add(foodItem);
    }

    public List<FoodItem> getItems(){
        return items;
    }

    public double getTotal(){
        double total = 0;
        for(FoodItem foodItem : items){
            total += foodItem.getPrice();
        }
        return total;
    }


    public void showOrder(){
        System.out.print("Order Items:\n");
        for(FoodItem foodItem : items){
            System.out.print(foodItem.getName() + ",\n");
        }
        System.out.println("Total: $" + this.getTotal());
    }
}
