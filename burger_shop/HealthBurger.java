
package burger_shop;

public class HealthBurger extends burger_shop.Burger {

    private String[] healthyToppings = {"Lettuce", "Tomatoes", "Pickles", "Guacamole", "Carrots"};

    public HealthBurger(burger_shop.Meat meat) {
        super(meat, burger_shop.Bread.Lettuce);
        this.setBurgerName("Healthy");
        this.setBurgerPrice(4.50);
        this.setMaxToppings(4);
    }

    @Override public void addToppings(burger_shop.Topping... topping) {
        for(burger_shop.Topping t: topping){
            if(t.isHealthy()) {
                super.addToppings(topping);
            } else {
                System.out.println(t.getToppingName() + " is not healthy and cannot be ordered on the Healthy Burger.");
            }
        }
    }
}