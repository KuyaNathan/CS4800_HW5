public class BasicFoodItem implements FoodItem{
    private String name;
    private double basePrice;

    public BasicFoodItem(String name, double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }

    public double getPrice(){
        return basePrice;
    }

    public String getName(){
        return name;
    }
}
