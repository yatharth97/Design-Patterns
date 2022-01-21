package strategyPattern.camera;

public class Text implements ShareStrategy{
    @Override
    public void share() {
        System.out.println("New way to share algorithm");
    }
}
