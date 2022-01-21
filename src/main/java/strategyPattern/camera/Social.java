package strategyPattern.camera;

public class Social implements ShareStrategy{
    @Override
    public void share() {
        System.out.println("Share using social media");
    }
}
