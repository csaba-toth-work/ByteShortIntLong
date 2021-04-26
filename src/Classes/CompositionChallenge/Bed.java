package Classes.CompositionChallenge;

public class Bed {
    private String color;
    private String material;
    private Dimensions dimensions;

    public Bed(String color, String material, Dimensions dimensions) {
        this.color = color;
        this.material = material;
        this.dimensions = dimensions;
    }

    public void makeTheBed() {
        System.out.println("The bed has been made.");
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
