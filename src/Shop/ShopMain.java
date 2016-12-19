package Shop;

import Shop.Customer.Customer;
import Shop.Customer.CustomerCreator;
import Shop.ShopAnalizer.ShopAnalizer;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-16.
 */
public class ShopMain {
    public static void main(String[] args) {

        Customer customer = new Customer();
        ShopAnalizer shopAnalizer = new ShopAnalizer();
        List<Customer> customerList = new CustomerCreator().createCustomer();

        shopAnalizer.ShowCustomersList(customerList);

        //customer.showProduct();


    }
}

