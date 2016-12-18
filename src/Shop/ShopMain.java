package Shop;

import Shop.ShopCreator.ShopCreator;
import Shop.ShopCreator.ShopList;
import Shop.ShopCreator.Shopping;
import Shop.ShopProducts.Cloth;
import Shop.ShopProducts.Electronic;
import Shop.ShopProducts.Food;
import Shop.ShopProducts.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-16.
 */
public class ShopMain {
    public static void main(String[] args) {

        ShopCreator shopCreator = new ShopCreator();
        ShopList shopList = shopCreator.createShopList();
        List<Cloth> clothList1 = shopList.getClothList();

        for (Cloth cloth : clothList1) {
            System.out.println(cloth.getType() + " kosztuje " + cloth.getPrice());
        }


     }
}

