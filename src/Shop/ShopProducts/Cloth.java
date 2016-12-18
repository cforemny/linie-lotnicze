package Shop.ShopProducts;

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

    }
}
