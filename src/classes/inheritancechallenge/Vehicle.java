package classes.inheritancechallenge;

public class Vehicle {
    private String color;
    private int age;
    private int sizeOfEngine;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String color, int age, int sizeOfEngine) {
        this.color = color;
        this.age = age;
        this.sizeOfEngine = sizeOfEngine;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steering(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getSizeOfEngine() {
        return sizeOfEngine;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
