package Shop.ShopCreator;

import Shop.ShopProducts.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-16.
 */
public class ShopCreator {

    private ShopList shopList = createShopList();

    public ShopList getShopList() {
        return shopList;
    }

    public ShopList createShopList() {

        Food food1 = new Food(5, FoodType.FRUIT,2);
        Food food2 = new Food(3, FoodType.BREAD,2.5);
        Food food3 = new Food(3,FoodType.MEAT,19);
        Food food4 = new Food(5,FoodType.VEGATABLE,1);
        Food food5 = new Food(14,FoodType.MEAT,45);

        List<Food> foodList = new ArrayList();

        foodList.add(food1);
        foodList.add(food2);
        foodList.add(food3);
        foodList.add(food4);
        foodList.add(food5);


        Electronic electronic1 = new Electronic("TV",true,2500);
        Electronic electronic2 = new Electronic("Pendrive",false,35);
        Electronic electronic3 = new Electronic("Bateria AAA",false,3);
        Electronic electronic4 = new Electronic("Lodowka",true,2999.99);
        Electronic electronic5 = new Electronic("Suszarka",true,99.99);

        List<Electronic> electronicList = new ArrayList();

        electronicList.add(electronic1);
        electronicList.add(electronic2);
        electronicList.add(electronic3);
        electronicList.add(electronic4);
        electronicList.add(electronic5);


        Cloth cloth1 = new Cloth(Size.XS,"Sweter",69.50);
        Cloth cloth2 = new Cloth(Size.M,"Spodnie",69.50);
        Cloth cloth3 = new Cloth(Size.L,"Skarpety",19.50);
        Cloth cloth4 = new Cloth(Size.XL,"Kurtka",299.50);
        Cloth cloth5 = new Cloth(Size.S,"Sweter",49.50);

        List<Cloth> clothList = new ArrayList();

        clothList.add(cloth1);
        clothList.add(cloth2);
        clothList.add(cloth3);
        clothList.add(cloth4);
        clothList.add(cloth5);

        return new ShopList(foodList,clothList,electronicList);

    }
}
