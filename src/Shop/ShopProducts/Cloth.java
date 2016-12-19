package Shop.ShopProducts;

import Shop.ShopCreator.ShopCreator;
import Shop.ShopCreator.ShopList;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-16.
 */
public class Cloth implements Product {

    private  Enum<Size> size;
    private String type;
    private  double price;

    public Cloth(Enum<Size> size, String type, double price) {
        this.size = size;
        this.type = type;
        this.price = price;
    }

    public Cloth() {
    }

    public Enum<Size> getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void showProduct() {
        ShopCreator shopCreator = new ShopCreator();
        ShopList shopList = shopCreator.createShopList();
        List<Cloth> clothList1 = shopList.getClothList();

        for (Cloth cloth : clothList1) {
            System.out.println(cloth.getType() + " rozmiar " + cloth.getSize() + " kosztuje " + cloth.getPrice() + " zł");
        }
        System.out.println("\n");
    }
}
