package Classes.MasterChallengeSolution1;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("oat roll", "beef", 10, "Hamburger");
        hamburger.selectAddition("onion", "salad", "lettuce", "pepper");
        hamburger.getPriceDetails();
        System.out.println("***************");

        DeluxeBurger deluxeBurger = new DeluxeBurger("honey roll", "pork", 20, "Deluxe burger");
        deluxeBurger.selectAddition("onion", "salad", "lettuce", "pepper");
        deluxeBurger.getPriceDetails();
        System.out.println("***************");

        HealthyBurger healthyBurger = new HealthyBurger("mixed", 15);
        healthyBurger.selectAddition("onion", "salad", "lettuce", "pepper", "ketchup", "carrot");
        healthyBurger.getPriceDetails();
    }
}
