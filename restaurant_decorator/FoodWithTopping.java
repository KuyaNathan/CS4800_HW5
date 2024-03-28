public class FoodWithTopping implements FoodItem{
    private FoodItem baseFoodItem;
    private String toppingName;
    private double toppingPrice;

    public FoodWithTopping(FoodItem baseFoodItem, String toppingName, double toppingPrice){
        this.baseFoodItem = baseFoodItem;
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
    }

    public double getPrice(){
        return baseFoodItem.getPrice() + toppingPrice;
    }

    public String getName(){
        return baseFoodItem.getName() + " + " + toppingName;
    }
}
