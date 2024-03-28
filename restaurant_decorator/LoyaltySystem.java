public class LoyaltySystem {

    public static final double bronzeDiscount = 0.05;
    public static final double silverDiscount = 0.10;
    public static final double goldDiscount = 0.15;

    public double applyLoyaltyDiscount(double total, String loyaltyLevel){
        if(loyaltyLevel.equalsIgnoreCase("bronze")){
            return (double) Math.round((total * (1 - bronzeDiscount)) * 100) / 100;
        }
        else if(loyaltyLevel.equalsIgnoreCase("silver")){
            return (double) Math.round((total * (1 - silverDiscount)) * 100) / 100;
        }
        else if(loyaltyLevel.equalsIgnoreCase("gold")){
            return (double) Math.round((total * (1 - goldDiscount)) * 100) / 100;
        }
        else{
            return total;
        }
    }

    public void showDiscountTotal(double total, String loyaltyLevel){
        System.out.println(loyaltyLevel + " discounted total: $" +
                this.applyLoyaltyDiscount(total, loyaltyLevel));
        System.out.println();
    }
}
