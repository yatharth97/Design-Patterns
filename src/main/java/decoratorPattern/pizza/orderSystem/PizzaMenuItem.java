package decoratorPattern.pizza.orderSystem;

public abstract class PizzaMenuItem {
    protected String description;

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
