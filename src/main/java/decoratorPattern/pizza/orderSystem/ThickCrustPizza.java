package decoratorPattern.pizza.orderSystem;

public class ThickCrustPizza extends PizzaMenuItem {

    public ThickCrustPizza() {
        description = "Thick Crust Pizza";
    }

    @Override
    public double cost() {
        return 7;
    }
}
