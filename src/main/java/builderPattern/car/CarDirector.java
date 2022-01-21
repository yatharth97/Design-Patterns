package builderPattern.car;

public class CarDirector {

    void construct() {
        CarBuilder builder = new SedanBuilder();
        Car car = builder.addFrontDoor().addFrontDoor().build();
    }
}
