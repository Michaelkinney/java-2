package burger_shop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Meal {
    burger_shop.Burger mealBurger;
    burger_shop.Side mealSide;
    burger_shop.Drink mealDrink;
    public final ArrayList<burger_shop.Side> sidesList;
    private double mealPrice;

    public static final Meal Basic = new Meal();
    public static final Meal Deluxe = new Meal(burger_shop.Burger.Deluxe, burger_shop.Side.IceCream, burger_shop.Drink.DrPepper);
    public static final Meal Health = new Meal(burger_shop.Burger.Health, burger_shop.Side.AppleSlices, burger_shop.Drink.Water);

    private static final DecimalFormat priceFormat = new DecimalFormat("##0.00");

    public Meal() {
        this.mealBurger = burger_shop.Burger.Basic;
        this.mealSide = burger_shop.Side.Fries;
        this.mealDrink = burger_shop.Drink.Water;
        this.sidesList = new ArrayList<>(Collections.singletonList(mealSide));
        this.mealPrice = this.basicMealPrice();
    }

    public Meal(burger_shop.Burger mealBurger, burger_shop.Side mealSide, burger_shop.Drink mealDrink) {
        this.mealBurger = mealBurger;
        this.mealSide = mealSide;
        this.sidesList = new ArrayList<>(Collections.singletonList(mealSide));
        this.mealDrink = mealDrink;
        this.mealPrice = this.basicMealPrice();

    }

    public void changeBurger(burger_shop.Burger newMealBurger) {
        this.mealBurger = newMealBurger;
        this.mealPrice = this.basicMealPrice();
    }

    public void changeDrink(burger_shop.Drink newMealDrink) {
        this.mealDrink = newMealDrink;
        this.mealPrice = this.basicMealPrice();
    }

    private String printSides() {
        ArrayList<String> sideNames = new ArrayList<>();
        for(burger_shop.Side s: sidesList) {
            sideNames.add(s.getSideName());
        }
        return sideNames.toString().replace("[", "").replace("]", "");
    }

    public void printBasicMealPrice() {
        this.mealBurger.printBasicBurgerPrice();
        System.out.println("Side(s): " + this.printSides());
        System.out.println("Drink: " + this.mealDrink.getDrinkName());
        System.out.println(this.mealBurger.getBurgerName() + " meal price before additional toppings or sides: $" + priceFormat.format(this.mealPrice));
    }

    public double basicMealPrice() {
        return this.mealBurger.basicBurgerPrice() + this.mealSide.getSidePrice() + this.mealDrink.getDrinkPrice();
    }

    public void addSide(burger_shop.Side... newSide) {
        for(burger_shop.Side s: newSide) {
            if(this.sidesList.contains(s)) {
                System.out.println(s.getSideName() + " has already been added to this meal, please pick a new side.");
            } else if(this.sidesList.size() >= 3) {
                System.out.println("You may only add 3 sides to a meal, " + s.getSideName() + " not added.");
            } else {
                System.out.println("Added " + s.getSideName() + " for an extra $" + priceFormat.format(s.getSidePrice()));
                sidesList.add(s);
            }
        }
    }
}