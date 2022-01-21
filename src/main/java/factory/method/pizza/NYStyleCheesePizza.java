package factory.method.pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Cheese Pizza";
    }

    @Override
    public void preparePizza() {}
    @Override
    public void bakePizza() {}

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
