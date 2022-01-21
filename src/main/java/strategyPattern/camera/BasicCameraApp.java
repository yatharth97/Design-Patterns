package strategyPattern.camera;

public class BasicCameraApp extends PhoneCameraApp {
    public BasicCameraApp() {
        shareStrategy = new Email();
    }

    public void edit() {
        System.out.println("edit in basic camera app");
    }
}
