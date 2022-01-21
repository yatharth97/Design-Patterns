package decoratorPattern.pizza.orderSystem;

public class ThinCrustPizza extends PizzaMenuItem {

    public ThinCrustPizza() {
        description = "Thin Crust Pizza";
    }

    @Override
    public double cost() {
        return 5;
    }
}
