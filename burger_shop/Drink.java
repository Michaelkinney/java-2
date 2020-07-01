
package burger_shop;

public class Drink {
    private final String drinkName;
    private final double drinkPrice;

    public static final Drink Water = new Drink("water", 0.50);
    public static final Drink Gatorade = new Drink("Gatorade", 1.00);
    public static final Drink Coke = new Drink("Coke", 1.00);
    public static final Drink Sprite = new Drink("Sprite", 1.00);
    public static final Drink DrPepper = new Drink("Dr. Pepper", 1.00);

    public Drink(String drinkName, double drinkPrice) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkName() {
        return this.drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

}