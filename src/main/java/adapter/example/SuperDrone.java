package adapter.example;

public class SuperDrone implements Drone {

    @Override
    public void beep() {
        System.out.println("beep beep beep");
    }

    @Override
    public void spin_rotors() {
        System.out.println("Rotors are spinning");
    }

    @Override
    public void take_off() {
        System.out.println("Taking off");
    }
}
