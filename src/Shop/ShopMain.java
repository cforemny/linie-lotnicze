package Shop;

import Shop.Customer.Customer;
import Shop.Customer.CustomerCreator;
import Shop.ShopAnalizer.CustomerAnalizer;
import Shop.ShopAnalizer.ListAnalizer;
import Shop.ShopAnalizer.ProductAnalizer;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-16.
 */
public class ShopMain {
    public static void main(String[] args) {

        Customer customer = new Customer();
        CustomerAnalizer customerAnalizer = new CustomerAnalizer();
        List<Customer> customerList = new CustomerCreator().createCustomer();
        ListAnalizer listAnalizer = new ListAnalizer();

        listAnalizer.compareCustomerToShop(customerList);
        ProductAnalizer productAnalizer = new ProductAnalizer();
        productAnalizer.comapreProduct();

        // customerAnalizer.ShowCustomersList(customerList);
      // customer.showProduct();




    }
}

