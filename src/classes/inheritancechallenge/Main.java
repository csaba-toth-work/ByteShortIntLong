package classes.inheritancechallenge;

public class Main {

    public static void main(String[] args) {
        Toyota toyota =  new Toyota("blue", 10, 5, 36);
        toyota.steering(45);
        toyota.accelerate(30);
        toyota.accelerate(20);
        toyota.accelerate(-42);
    }
}
