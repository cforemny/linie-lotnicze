package Shop.ShopAnalizer;

import Shop.Customer.Customer;
import Shop.Customer.CustomerList;
import Shop.ShopProducts.Cloth;
import Shop.ShopProducts.Electronic;
import Shop.ShopProducts.Food;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-16.
 */
public class CustomerAnalizer {

    public void ShowCustomersList(List<Customer> customerList){

        for (Customer customer : customerList) {
            System.out.println("KLIENCI CHCA DZISIAJ KUPIC:" + "\n");
            for (Food food : customer.getFoodList()) {
                System.out.println("" + food.getFoodType() + ", data ważności " + food.getExpirationDate() + " dni, cena " + food.getPrice() + " zł");
            }
            System.out.println("\n");
            for (Cloth cloth : customer.getClothList()) {
                System.out.println(cloth.getType() + ", o rozmiarze " + cloth.getSize() + ", kosztuje " + cloth.getPrice() + " zł");

            }
            System.out.println("\n");
            for (Electronic electronic : customer.getElectronicList()) {
                System.out.println(electronic.getType() + ", z gwarancja: " + electronic.isGuarantee() + ", kosztuje " + electronic.getPrice() + " zł");

            }

        }


    }
}
