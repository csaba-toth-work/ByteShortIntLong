package Classes.PolymorphismChallenge;

class Car {
    private String manufacturer;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;
    private boolean isManual;
    private String color;
    private int currentSpeed;

    public Car(String manufacturer, int doors, boolean isManual, String color) {
        this.manufacturer = manufacturer;
        this.doors = doors;
        this.isManual = isManual;
        this.color = color;
        this.cylinders = 4;
        this.wheels = 4;
        this.engine = true;
        this.currentSpeed = 0;
    }

    public void startEngine() {
        System.out.println("Car is started");
    }

    public void stopEngine() {
        System.out.println("Car is turned off");
        currentSpeed = 0;
    }

    public void accelerate(int speed) {
        if(speed > 0) {
            currentSpeed = speed;
        } else {
            System.out.println("Invalid value");
        }
    }

    public void brake() {
        if(currentSpeed > 10) {
            currentSpeed -= 10;
        } else {
            System.out.println("Speed is too slow");
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isManual() {
        return isManual;
    }

    public String getColor() {
        return color;
    }
}

class Toyota extends Car {

    public Toyota() {
        super("Toyota", 5, false, "brown");
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota is starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Toyota is stopping");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Toyota is accelerating");
        super.accelerate(speed);
    }

    @Override
    public void brake() {
        System.out.println("Toyota is braking");
        super.brake();
    }
}

class Honda extends Car {

    public Honda() {
        super("Honda", 4, true, "black");
    }

    @Override
    public void startEngine() {
        System.out.println("Honda is starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Honda is stopping");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Honda is accelerating");
        super.accelerate(speed);
    }

    @Override
    public void brake() {
        System.out.println("Honda is braking");
        super.brake();
    }
}

class Renault extends Car {

    public Renault() {
        super("Renault", 4, true, "blue");
    }

    @Override
    public void startEngine() {
        System.out.println("Renault is starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Renault is stopping");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Renault is accelerating");
        super.accelerate(speed);
    }

    @Override
    public void brake() {
        System.out.println("Renault is braking");
        super.brake();
    }
}

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
           Car car = randomCarMaker();
            System.out.println(car.getManufacturer());
            System.out.println(car.getColor());
            car.startEngine();
            car.stopEngine();
            System.out.println("**************");
        }

    }

    public static Car randomCarMaker() {
        int randomNumber = (int) (Math.random() * 3) +1;

        switch (randomNumber) {
            case 1:
                return new Toyota();
            case 2:
                return new Honda();
            case 3:
                return new Renault();
        }
        return null;
    }
}
