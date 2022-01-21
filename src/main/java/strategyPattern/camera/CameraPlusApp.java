package strategyPattern.camera;

public class CameraPlusApp extends PhoneCameraApp {
    public CameraPlusApp() {
        shareStrategy = new Text();
    }
    public void edit() {
        System.out.println("edit in Camera plus App");
    }
}
