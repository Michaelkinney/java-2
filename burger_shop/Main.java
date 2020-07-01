package burger_shop;

public class Main {


    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application
        burger_shop.Order myOrder = new burger_shop.Order(burger_shop.Burger.Health, burger_shop.Bread.Wheat, burger_shop.Meat.Bison);
        myOrder.addToppings(burger_shop.Topping.Bacon);
        myOrder.addToppings(burger_shop.Topping.Cheese);
        myOrder.addToppings(burger_shop.Topping.Bacon);
        myOrder.addToppings(burger_shop.Topping.Carrots);
        myOrder.addToppings(burger_shop.Topping.Onions);
        myOrder.addToppings(burger_shop.Topping.Tomatoes);
        myOrder.printOrderTotal();
        

    }
}