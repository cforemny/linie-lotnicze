package Shop.ShopProducts;

import Shop.ShopCreator.ShopCreator;
import Shop.ShopCreator.ShopList;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-16.
 */
public class Electronic implements Product {

    private String type;
    private boolean guarantee;
    private double price;

    public Electronic(String type, boolean guarantee, double price) {
        this.type = type;
        this.guarantee = guarantee;
        this.price = price;
    }

    public Electronic() {
    }

    public String getType() {
        return type;
    }

    public boolean isGuarantee() {
        return guarantee;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void showProduct() {

        ShopCreator shopCreator = new ShopCreator();
        ShopList shopList = shopCreator.createShopList();
        List<Electronic> electronicList1 = shopList.getElectronicList();

        for (Electronic electronic : electronicList1) {

            System.out.println(electronic.getType() + " gwarancja " + electronic.isGuarantee() + " i kosztuje " + electronic.getPrice() + " zł");

        }
        System.out.println("\n");
    }
}
