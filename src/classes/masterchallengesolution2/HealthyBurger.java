package classes.masterchallengesolution2;

public class HealthyBurger extends Hamburger {

    String healthyAddition1Name;
    double healthyAddition1Price;

    String healthyAddition2Name;
    double healthyAddition2Price;


    public HealthyBurger(String meat, double price) {
        super("Healthy burger", "brown rye bread", meat, price);

    }

    @Override
    public double itemize() {
        double price = super.itemize();
        if (healthyAddition1Name != null) {
            price += healthyAddition1Price;
            System.out.println("Added " + this.healthyAddition1Name + " for an extra " + this.healthyAddition1Price);
        }
        if (healthyAddition2Name != null) {
            price += healthyAddition2Price;
            System.out.println("Added " + this.healthyAddition2Name + " for an extra " + this.healthyAddition2Price);
        }
        return price;
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyAddition1Name = name;
        this.healthyAddition1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyAddition2Name = name;
        this.healthyAddition2Price = price;
    }
}
