package adapter.example;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Wild Turkey gobbles");
    }

    @Override
    public void fly() {
        System.out.println("Wild Turkey can fly");
    }
}
