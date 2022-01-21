package builderPattern.car;

public abstract class CarBuilder implements Car {
    abstract CarBuilder addFrontDoor();
    abstract CarBuilder addBackDoor();
    abstract CarBuilder addMoonRoof();
}
