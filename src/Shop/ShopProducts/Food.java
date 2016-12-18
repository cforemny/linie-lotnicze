package Shop.ShopProducts;

/**
 * Created by Cyprian on 2016-12-16.
 */
public class Food implements Product {

    private int expirationDate;
    private Enum<FoodType> foodType;
    private double price;

    public Food(int expirationDate, Enum<FoodType> foodType, double price) {
        this.expirationDate = expirationDate;
        this.foodType = foodType;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public Enum<FoodType> getFoodType() {
        return foodType;
    }

    @Override
    public void showProduct() {

    }
}
