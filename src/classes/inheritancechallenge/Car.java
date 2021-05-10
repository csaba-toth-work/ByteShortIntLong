package classes.inheritancechallenge;

public class Car extends Vehicle {

    private int numberOfPassengers;
    private int doors;
    private int gears;
    private int wheels;
    private boolean isManual;

    private int currentGear;

    public Car(String color, int age, int sizeOfEngine, int numberOfPassengers, int doors, int gears, int wheels, boolean isManual) {
        super(color, age, sizeOfEngine);
        this.numberOfPassengers = numberOfPassengers;
        this.doors = doors;
        this.gears = gears;
        this.wheels = wheels;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear() Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
    }


}
