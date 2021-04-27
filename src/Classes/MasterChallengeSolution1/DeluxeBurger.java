package Classes.MasterChallengeSolution1;

public class DeluxeBurger extends Hamburger {
    private boolean drink;
    private boolean chips;

    public DeluxeBurger(String rollType, String meat, int price, String name) {
        super(rollType, meat, price, name);
        this.drink = true;
        this.chips = true;
    }

    @Override
    public void selectAddition(String addition1, String addition2, String addition3, String addition4) {
        System.out.println("Cant select any additions");
    }

    @Override
    public void getPriceDetails() {
        System.out.println("Drink and chips included");
        System.out.println("Final price is " + getBasePrice() + "$");
    }
}
