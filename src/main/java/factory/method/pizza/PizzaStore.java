package factory.method.pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("Making a "+pizza.getName());
        pizza.preparePizza();
        pizza.bakePizza();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    abstract Pizza createPizza(String pizzaType);
}
