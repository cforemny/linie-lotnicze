package Shop.Customer;

import Shop.ShopProducts.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-19.
 */
public class CustomerCreator {

    public List<Customer> createCustomer(){

        Customer firstCursomer = createFirstCustomer();
        ArrayList<Customer> customerList = new ArrayList<>();

        customerList.add(firstCursomer);
        return customerList;
    }

    public Customer createFirstCustomer(){

        Food food1 = new Food(2, FoodType.FRUIT,10);  // produkt niezgodny ze sklepem
        Food food2 = new Food(3, FoodType.BREAD,2.5);
        Food food3 = new Food(3,FoodType.MEAT,19);
        List<Food> foodList = new ArrayList();

        foodList.add(food1);
        foodList.add(food2);
        foodList.add(food3);

        Electronic electronic1 = new Electronic("TV",true,2500);
        Electronic electronic2 = new Electronic("Pendrive",false,35);
        Electronic electronic3 = new Electronic("Bulbulgator",false,3);  // produkt niezgodny ze sklepem

        List<Electronic> electronicList = new ArrayList();

        electronicList.add(electronic1);
        electronicList.add(electronic2);
        electronicList.add(electronic3);

        Cloth cloth1 = new Cloth(Size.XS, "Sweter", 69.50);
        Cloth cloth2 = new Cloth(Size.M, "Drwalskie onuce", 69.50); // produkt niezgodny ze sklepem
        Cloth cloth3 = new Cloth(Size.L, "Skarpety", 19.50);

        List<Cloth> clothList = new ArrayList();

        clothList.add(cloth1);
        clothList.add(cloth2);
        clothList.add(cloth3);

        return new Customer(foodList,clothList,electronicList);

    }




}
