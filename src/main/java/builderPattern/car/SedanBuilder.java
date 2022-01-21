package builderPattern.car;

public class SedanBuilder extends CarBuilder implements Sedan {


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

    public Car build() {
        return this;
    }
}
