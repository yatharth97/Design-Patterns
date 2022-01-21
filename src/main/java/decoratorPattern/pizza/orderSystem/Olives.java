package decoratorPattern.pizza.orderSystem;

public class Olives extends ToppingsDecorator {
    PizzaMenuItem pizzaMenuItem;

    public Olives(PizzaMenuItem pizzaMenuItem) {
        this.pizzaMenuItem = pizzaMenuItem;
    }

    @Override
    public double cost() {
        return pizzaMenuItem.cost() + 0.25;
    }

    @Override
    public String getDescription() {
        return pizzaMenuItem.getDescription() + ", Olives";
    }
}
