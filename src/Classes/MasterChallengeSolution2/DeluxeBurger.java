package Classes.MasterChallengeSolution2;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(double price) {
        super("Deluxe burger", "white flat bread", "sausage and bacon", price);
        super.addHamburgerAddition1("Coke", 1.99);
        super.addHamburgerAddition2("Fries", 0.99);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add any addition");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add any addition");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add any addition");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add any addition");
    }
}
