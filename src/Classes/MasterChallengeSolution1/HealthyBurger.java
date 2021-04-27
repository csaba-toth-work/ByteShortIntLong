package Classes.MasterChallengeSolution1;

public class HealthyBurger extends Hamburger {


    public HealthyBurger(String meat, int basePrice) {
        super("brown rye bread", meat, basePrice, "Healthy burger");
    }

    public void selectAddition(String addition1, String addition2, String addition3, String addition4, String addition5, String addition6) {
        if (addition1.equals("onion") || addition2.equals("onion") || addition3.equals("onion") || addition4.equals("onion")
                || addition5.equals("onion") || addition6.equals("onion")) {
            setOnion(true);
            setAdditionsPrice(getAdditionsPrice() + 1);
        }
        if (addition1.equals("salad") || addition2.equals("salad") || addition3.equals("salad") || addition4.equals("salad")
                || addition5.equals("salad") || addition6.equals("salad")) {
            setSalad(true);
            setAdditionsPrice(getAdditionsPrice() + 1);
        }
        if (addition1.equals("lettuce") || addition2.equals("lettuce") || addition3.equals("lettuce") || addition4.equals("lettuce")
                || addition5.equals("lettuce") || addition6.equals("lettuce")) {
            setLettuce(true);
            setAdditionsPrice(getAdditionsPrice() + 1);
        }
        if (addition1.equals("pepper") || addition2.equals("pepper") || addition3.equals("pepper") || addition4.equals("pepper")
                || addition5.equals("pepper") || addition6.equals("pepper")) {
            setPepper(true);
            setAdditionsPrice(getAdditionsPrice() + 1);
        }
        if (addition1.equals("ketchup") || addition2.equals("ketchup") || addition3.equals("ketchup") || addition4.equals("ketchup")
                || addition5.equals("ketchup") || addition6.equals("ketchup")) {
            setKetchup(true);
            setAdditionsPrice(getAdditionsPrice() + 1);
        }
        if (addition1.equals("mustard") || addition2.equals("mustard") || addition3.equals("mustard") || addition4.equals("mustard")
                || addition5.equals("mustard") || addition6.equals("mustard")) {
            setMustard(true);
            setAdditionsPrice(getAdditionsPrice() + 1);
        }
        setFinalPrice(getFinalPrice() + getAdditionsPrice());
        setFinalPrice(getFinalPrice() + getBasePrice());
    }

}

