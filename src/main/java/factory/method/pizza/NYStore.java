package factory.method.pizza;

public class NYStore extends PizzaStore {
    @Override
    Pizza createPizza(String pizzaType) {
        if(pizzaType.equals("cheese")) return new NYStyleCheesePizza();
        if(pizzaType.equals("veggie")) return new NYStyleVeggiePizza();
        return null;
    }
}
