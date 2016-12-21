package Shop.Customer;

import Shop.ShopProducts.Product;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-21.
 */
public class CustomerProduct implements Product {

    private List<Product> customerProductList;

    public CustomerProduct(List<Product> customerProductList) {
        this.customerProductList = customerProductList;
    }

    public CustomerProduct() {
    }

    public List<Product> getCustomerProductList() {
        return customerProductList;
    }

    public void setCustomerProductList(List<Product> customerProductList) {
        this.customerProductList = customerProductList;
    }

    @Override
    public void showProduct() {


    }
}
