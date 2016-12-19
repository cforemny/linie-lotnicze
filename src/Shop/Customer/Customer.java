package Shop.Customer;

import Shop.ShopProducts.Cloth;
import Shop.ShopProducts.Electronic;
import Shop.ShopProducts.Food;
import Shop.ShopProducts.Product;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-18.
 */
public class Customer implements Product {

    private List<Food> foodList;
    private List<Cloth> clothList;
    private List<Electronic> electronicList;

    public Customer(List<Food> foodList, List<Cloth> clothList, List<Electronic> electronicList) {
        this.foodList = foodList;
        this.clothList = clothList;
        this.electronicList = electronicList;
    }

    public Customer() {
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public List<Cloth> getClothList() {
        return clothList;
    }

    public List<Electronic> getElectronicList() {
        return electronicList;
    }

    @Override
    public void showProduct() {
            System.out.println("Oto list produktów w naszym sklepie: \n");
            Cloth cloth = new Cloth();
            cloth.showProduct();
            Food food = new Food();
            food.showProduct();
            Electronic electronic = new Electronic();
            electronic.showProduct();






    }
}

