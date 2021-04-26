package Classes.CompositionChallenge;

public class Desk {
    private String color;
    private String material;
    private Dimensions dimensions;

    public Desk(String color, String material, Dimensions dimensions) {
        this.color = color;
        this.material = material;
        this.dimensions = dimensions;
    }

    public void cover() {
        System.out.println("The desk has been covered");
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
