package Classes.CompositionChallenge;

public class Chair {
    private String color;
    private String material;
    private Dimensions dimensions;

    public Chair(String color, String material, Dimensions dimensions) {
        this.color = color;
        this.material = material;
        this.dimensions = dimensions;
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
