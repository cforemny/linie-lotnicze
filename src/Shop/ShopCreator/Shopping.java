package Shop.ShopCreator;

import Shop.ShopProducts.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-18.
 */
public class Shopping implements Product {
    private List<Shopping> shoppingList=createShoppingList();

    public List<Shopping> getShoppingList() {
        return shoppingList;
    }

    public List<Shopping> createShoppingList(){

        ShopList clothList = (ShopList) new ShopCreator().createShopList().getClothList();
        ShopList electronicList = (ShopList) new ShopCreator().createShopList().getElectronicList();
        ShopList foodList = (ShopList) new ShopCreator().createShopList().getElectronicList();

        List shoppingList = new ArrayList();

        shoppingList.add(clothList);
        shoppingList.add(electronicList);
        shoppingList.add(foodList);

        return this.shoppingList;

        }

    @Override
    public void showProduct() {






    }
}

