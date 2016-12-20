package Shop.ShopAnalizer;

import Shop.Customer.Customer;
import Shop.ShopCreator.ShopCreator;
import Shop.ShopCreator.ShopList;
import Shop.ShopProducts.Cloth;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-19.
 */
public class ListAnalizer {

    public void compareCustomerToShop(List<Customer> customerList) {
        ShopCreator shopCreator = new ShopCreator();
        ShopList shopList = shopCreator.createShopList();
        List<Cloth> clothList1 = shopList.getClothList();
//        List<Cloth> duplikaty = new ArrayList<>();


        System.out.println("Z listy klienta w sklepie jest:");
        for (Customer customer : customerList) {

            for (Cloth clothShop : clothList1) {
                for (Cloth clothCustomer : customer.getClothList()) {

                    if (clothShop.getType() == clothCustomer.getType() && clothShop.getSize() == clothCustomer.getSize() && clothShop.getPrice() == clothCustomer.getPrice()) {

                        System.out.println(clothCustomer.getType() + " w rozmiarze " + clothCustomer.getSize() + " ,kosztuje " + clothCustomer.getPrice() + " zł");
                    }
                    }

                }
            }
            System.out.println("\n");
        }







}
