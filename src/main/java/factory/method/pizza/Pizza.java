package factory.method.pizza;

public abstract class Pizza {
    String name;
    String getName() {
        return name;
    }
    public abstract void preparePizza();
    public abstract void bakePizza();
    public abstract void cut();
    public abstract void box();
}
