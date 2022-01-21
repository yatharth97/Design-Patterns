package builderPattern.car;

public class SUVBuilder extends CarBuilder implements SUV {


    public Car build() {
        return null;
    }

    @Override
    public CarBuilder addFrontDoor() {
        return this;
    }

    @Override
    public CarBuilder addBackDoor() {
        return this;
    }

    @Override
    public CarBuilder addMoonRoof() {
        return this;
    }
}
