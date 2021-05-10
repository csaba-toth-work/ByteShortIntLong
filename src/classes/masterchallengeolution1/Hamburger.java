package classes.masterchallengeolution1;

public class Hamburger {
    private String rollType;
    private String meat;
    private int basePrice;
    private int finalPrice;
    private int additionsPrice;
    private String name;
    private boolean onion;
    private boolean salad;
    private boolean lettuce;
    private boolean pepper;
    private boolean ketchup;
    private boolean mustard;


    public Hamburger(String rollType, String meat, int basePrice, String name) {
        this.rollType = rollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.name = name;
    }

    public void selectAddition(String addition1, String addition2, String addition3, String addition4) {
        if (addition1.equals("onion") || addition2.equals("onion") || addition3.equals("onion") || addition4.equals("onion")) {
            onion = true;
            additionsPrice++;
        }
        if (addition1.equals("salad") || addition2.equals("salad") || addition3.equals("salad") || addition4.equals("salad")) {
            salad = true;
            additionsPrice++;
        }
        if (addition1.equals("lettuce") || addition2.equals("lettuce") || addition3.equals("lettuce") || addition4.equals("lettuce")) {
            lettuce = true;
            additionsPrice++;
        }
        if (addition1.equals("pepper") || addition2.equals("pepper") || addition3.equals("pepper") || addition4.equals("pepper")) {
            pepper = true;
            additionsPrice++;
        }
        if (addition1.equals("ketchup") || addition2.equals("ketchup") || addition3.equals("ketchup") || addition4.equals("ketchup")) {
            ketchup = true;
            additionsPrice++;
        }
        if (addition1.equals("mustard") || addition2.equals("mustard") || addition3.equals("mustard") || addition4.equals("mustard")) {
            mustard = true;
            additionsPrice++;
        }
        finalPrice += basePrice;
        finalPrice += additionsPrice;
    }

    public void getPriceDetails() {
        System.out.println(basePrice + " is the base price");
        if (onion) {
            System.out.println("Onion costs +1$");
        }
        if (salad) {
            System.out.println("Salad costs +1$");
        }
        if (lettuce) {
            System.out.println("Lettuce costs +1$");
        }
        if (pepper) {
            System.out.println("Pepper costs +1$");
        }
        if (ketchup) {
            System.out.println("Ketchup costs +1$");
        }
        if (mustard) {
            System.out.println("Mustard costs +1$");
        }

        System.out.println("Sum of all additions: " + additionsPrice);
        System.out.println("Final price " + finalPrice + "$");
    }


    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getFinalPrice() {
        return finalPrice;
    }

    public int getAdditionsPrice() {
        return additionsPrice;
    }

    public String getName() {
        return name;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isSalad() {
        return salad;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isPepper() {
        return pepper;
    }

    public boolean isKetchup() {
        return ketchup;
    }

    public boolean isMustard() {
        return mustard;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public void setSalad(boolean salad) {
        this.salad = salad;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setPepper(boolean pepper) {
        this.pepper = pepper;
    }

    public void setKetchup(boolean ketchup) {
        this.ketchup = ketchup;
    }

    public void setMustard(boolean mustard) {
        this.mustard = mustard;
    }

    public void setAdditionsPrice(int additionsPrice) {
        this.additionsPrice = additionsPrice;
    }

    public void setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
    }
}
