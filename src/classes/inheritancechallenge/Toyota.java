package classes.inheritancechallenge;

public class Toyota extends Car {

    private int roadServiceMonths;

    public Toyota(String color, int age, int doors, int roadServiceMonths) {
        super(color, age, 3000, 4, 5, doors, 4, false);
        this.roadServiceMonths = roadServiceMonths;
    }



    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
