package Classes.MasterChallengeSolution2;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "white", "beef", 5.55);
        hamburger.addHamburgerAddition1("lettuce", 0.20);
        hamburger.addHamburgerAddition2("onion", 0.10);
        hamburger.addHamburgerAddition3("egg", 0.99);
        System.out.println("Total Burger price is " + hamburger.itemize());

        System.out.println("**************************");

        HealthyBurger healthyBurger = new HealthyBurger("sausage", 11.99);
        healthyBurger.addHamburgerAddition1("ham", 3.99);
        healthyBurger.addHealthyAddition1("radish", 0.99);
        System.out.println("Total Burger price is " + healthyBurger.itemize());

        System.out.println("**************************");

        DeluxeBurger deluxeBurger = new DeluxeBurger(15);
        deluxeBurger.addHamburgerAddition1("onion", 1.1);
        System.out.println("Total Burger price is " + deluxeBurger.itemize());
    }
}
