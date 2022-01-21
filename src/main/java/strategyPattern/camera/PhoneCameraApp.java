package strategyPattern.camera;

public abstract class PhoneCameraApp {
    ShareStrategy shareStrategy;

    public void take() {
        System.out.println("Take a photo");
    }
    public abstract void edit();
    void save() {
        System.out.println("Save a photo");
    }
    public void share() { shareStrategy.share(); }
}
