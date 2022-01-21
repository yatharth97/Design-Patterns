package strategyPattern.camera;

public class Email implements ShareStrategy{
    @Override
    public void share() {
        System.out.println("Share using email.");
    }
}
