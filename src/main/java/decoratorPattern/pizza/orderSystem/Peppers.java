package decoratorPattern.pizza.orderSystem;

public class Peppers extends ToppingsDecorator {
    PizzaMenuItem pizzaMenuItem;

    public Peppers(PizzaMenuItem pizzaMenuItem) {
        this.pizzaMenuItem = pizzaMenuItem;
    }

    @Override
    public double cost() {
        return pizzaMenuItem.cost()+ 0.15;
    }

    @Override
    public String getDescription() {
        return pizzaMenuItem + ", Peppers";
    }
}
