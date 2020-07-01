package burger_shop;


public class DeluxeBurger extends burger_shop.Burger {

    public DeluxeBurger(burger_shop.Meat meat, burger_shop.Bread breadRollType) {
        super(meat, breadRollType);
        this.setBurgerName("Deluxe");
        this.setBurgerPrice(5.00);
        this.setMaxToppings(6);
    }

}


