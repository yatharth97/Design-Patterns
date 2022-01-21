package factory.method.pizza;

public class ChicagoStore extends PizzaStore {

    @Override
    Pizza createPizza(String pizzaType) {
        if(pizzaType.equals("cheese")) return new ChicagoStyleCheesePizza();
        if(pizzaType.equals("veggie")) return new ChicagoStyleVeggiePizza();
        return null;
    }
}
