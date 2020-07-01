package burger_shop;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Burger {

    public static final Burger Basic = new Burger(burger_shop.Meat.Beef, burger_shop.Bread.White);
    public static final Burger Deluxe = new burger_shop.DeluxeBurger(burger_shop.Meat.Steak, burger_shop.Bread.Wheat);
    public static final Burger Health = new burger_shop.HealthBurger(burger_shop.Meat.Turkey);

    public String name;
    private burger_shop.Meat meat;
    private double price;
    private burger_shop.Bread breadRollType;
    public ArrayList<burger_shop.Topping> toppingsList;
    public int maxToppings;

    private static final DecimalFormat priceFormat = new DecimalFormat("##0.00");



    public Burger(burger_shop.Meat meat, burger_shop.Bread breadRollType){
        this.name = "Basic";
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = 4.00;
        this.toppingsList = new ArrayList<>();
        this.maxToppings = 2;

    }

    public String getBurgerName(){
        return name;
    }

    public void setBurgerName(String name){
        this.name = name;
    }

    public void setBurgerPrice(double price){
        this.price = price;
    }

    public void setMaxToppings(int maxToppings){
        this.maxToppings = maxToppings;
    }

    public void setMeat(burger_shop.Meat meat){
        this.meat = meat;
    }

    public void setBreadRollType(burger_shop.Bread breadRollType){
        this.breadRollType = breadRollType;
    }

    public void addToppings(burger_shop.Topping... topping){
        for(burger_shop.Topping t: topping){
            if(this.toppingsList.size() >= this.maxToppings) {
                System.out.println("Maximum toppings reached. The " + this.name + " Burger can only have " + this.maxToppings + " toppings, " + t.getToppingName() + " not added.");
            } else {
                System.out.println("Added " + t.getToppingName() + " for an extra $" + priceFormat.format(t.getToppingPrice()));
                this.toppingsList.add(t);
            }
        }
    }

    public double basicBurgerPrice(){
        return this.price;
    }

    public void printBasicBurgerPrice(){
        System.out.println(this.name + " hamburger with a " + this.meat.getMeatName() + " patty on a " + this.breadRollType.getBreadTypeName() + " bun, price is $" + priceFormat.format(this.price));
    }

    public void totalBurgerPrice() {
        double burgerPrice = this.price;
        for (burger_shop.Topping checkedTopping : toppingsList) {
            burgerPrice += checkedTopping.getToppingPrice();
        }
        System.out.println("Total burger price with toppings: $" + priceFormat.format(burgerPrice));
    }



}