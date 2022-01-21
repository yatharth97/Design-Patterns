package decoratorPattern.pizza.orderSystem;

public class Cheese extends ToppingsDecorator {
    PizzaMenuItem pizzaMenuItem;

    public Cheese(PizzaMenuItem pizzaMenuItem) {
        this.pizzaMenuItem = pizzaMenuItem;
    }

    @Override
    public double cost() {
        return pizzaMenuItem.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return pizzaMenuItem.getDescription() + ", Cheese";
    }
}
