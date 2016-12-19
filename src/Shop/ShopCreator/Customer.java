package Shop.ShopCreator;

import Shop.ShopProducts.Cloth;
import Shop.ShopProducts.Electronic;
import Shop.ShopProducts.Food;
import Shop.ShopProducts.Product;

/**
 * Created by Cyprian on 2016-12-18.
 */
public class Customer implements Product {

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

