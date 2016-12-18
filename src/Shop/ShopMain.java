package Shop;

import Shop.ShopCreator.ShopCreator;
import Shop.ShopCreator.ShopList;
import Shop.ShopCreator.Shopping;
import Shop.ShopProducts.Cloth;
import Shop.ShopProducts.Electronic;
import Shop.ShopProducts.Food;
import Shop.ShopProducts.Product;

import java.util.ArrayList;

/**
 * Created by Cyprian on 2016-12-16.
 */
public class ShopMain {
    public static void main(String[] args) {

        ShopList clothList = (ShopList) new ShopCreator().createShopList().getClothList();
        




    }
}

