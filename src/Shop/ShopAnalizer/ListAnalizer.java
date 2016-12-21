package Shop.ShopAnalizer;

import Shop.Customer.Customer;
import Shop.ShopCreator.ShopCreator;
import Shop.ShopCreator.ShopList;
import Shop.ShopProducts.Cloth;
import Shop.ShopProducts.Food;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-19.
 */
public class ListAnalizer {

  public void compareCustomerToShop(List<Customer> customerList) {
      ShopCreator shopCreator = new ShopCreator();
      ShopList shopList = shopCreator.createShopList(); // wygenerowac tutaj tylko lsite
      List<Cloth> clothList1 = shopList.getClothList();    System.out.println("Z listy klienta w sklepie JEST:");
      for (Customer customer : customerList) {        for (Cloth clothCustomer : customer.getClothList()) {
              if (compareCloth(clothList1, clothCustomer)) {
                  System.out.println(clothCustomer.getType() + " w rozmiarze " + clothCustomer.getSize() + " ,kosztuje " + clothCustomer.getPrice() + " zł");
              }
          }    }    System.out.println("Z listy klienta w sklepie NIE MA:");
      for (Customer customer : customerList) {        for (Cloth clothCustomer : customer.getClothList()) {
              if (!compareCloth(clothList1, clothCustomer)) {
                  System.out.println(clothCustomer.getType() + " w rozmiarze " + clothCustomer.getSize() + " ,kosztuje " + clothCustomer.getPrice() + " zł");
              }
          }    }
  }private boolean compareCloth(List<Cloth> clothList1, Cloth clothCustomer) {
      for (Cloth clothShop : clothList1) {
          if (clothShop.getType().equals(clothCustomer.getType()) && clothShop.getSize() == clothCustomer.getSize() && clothShop.getPrice() == clothCustomer.getPrice()) {
              return true;
          }
      }
      return false;
  }

}


