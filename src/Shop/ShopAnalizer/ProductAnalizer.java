package Shop.ShopAnalizer;

import Shop.Customer.Customer;
import Shop.Customer.CustomerCreator;
import Shop.Customer.CustomerProduct;
import Shop.ShopCreator.ShopProduct;
import Shop.ShopProducts.Cloth;
import Shop.ShopProducts.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-21.
 */
public class ProductAnalizer {

    public void comapreProduct(){

        CustomerCreator customerCreator = new CustomerCreator();
        Customer firstCustomer = customerCreator.createFirstCustomer();
        firstCustomer.getClothList();

        List<Product> productList = new ArrayList<>();
        productList.add((Product) firstCustomer.getClothList());









    }
}
