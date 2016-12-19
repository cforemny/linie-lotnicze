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
public class ShopAnalizer {

    public void ShowCustomersList(List<Customer> customerList){

        for (Customer customer : customerList) {
            System.out.println("KLIENCI CHCA DZISIAJ KUPIC:" + "\n");
            for (Food food : customer.getFoodList()) {
                System.out.println("" + food.getFoodType() + " data ważności" + food.getExpirationDate() + " cena " + food.getPrice());
            }
            System.out.println("\n");
            for (Cloth cloth : customer.getClothList()) {
                System.out.println(cloth.getType() + " o rozmiarze " + cloth.getSize() + " ksoztuje " + cloth.getPrice());

            }
            System.out.println("\n");
            for (Electronic electronic : customer.getElectronicList()) {
                System.out.println(electronic.getType() + " z gwarancja: " + electronic.isGuarantee() + " kosztuje " + electronic.getPrice());

            }

        }


    }
}
