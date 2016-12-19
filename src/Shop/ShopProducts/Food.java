package Shop.ShopProducts;

import Shop.ShopCreator.ShopCreator;
import Shop.ShopCreator.ShopList;

import java.util.List;

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

    public Food() {
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

        ShopCreator shopCreator = new ShopCreator();
        ShopList shopList = shopCreator.createShopList();
        List<Food> foodList1 = shopList.getFoodList();

        for (Food food : foodList1) {

            System.out.println(food.getFoodType() + " ma date przydatnosci " + food.getExpirationDate() + " i kosztuje " + food.getPrice() );
            
        }
        System.out.println("\n");

    }
}
