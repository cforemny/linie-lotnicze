package Shop.ShopProducts;

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

    }
}
