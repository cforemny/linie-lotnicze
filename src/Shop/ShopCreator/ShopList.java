package Shop.ShopCreator;

import Shop.ShopProducts.Cloth;
import Shop.ShopProducts.Electronic;
import Shop.ShopProducts.Food;
import Shop.ShopProducts.Product;

import java.util.*;

/**
 * Created by Cyprian on 2016-12-18.
 */
public class ShopList implements Product  {


   private List<Food> foodList;
   private List<Cloth> clothList;
   private List<Electronic> electronicList;

    public ShopList(List<Food> foodList, List<Cloth> clothList, List<Electronic> electronicList) {
        this.foodList = foodList;
        this.clothList = clothList;
        this.electronicList = electronicList;
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

    public ShopList() {
    }


    @Override
    public void showProduct() {

    }
}
