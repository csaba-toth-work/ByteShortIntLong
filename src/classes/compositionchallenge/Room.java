package classes.compositionchallenge;


import classes.composition.Dimensions;

public class Room {
    private Dimensions dimensions;
    private String colorOfWalls;
    private Bed bed;
    private Desk desk;
    private Chair chair;

    public Room(Dimensions dimensions, String colorOfWalls, Bed bed, Desk desk, Chair chair) {
        this.dimensions = dimensions;
        this.colorOfWalls = colorOfWalls;
        this.bed = bed;
        this.desk = desk;
        this.chair = chair;
    }

    public void tidyUpTheRoom() {
        bed.makeTheBed();
        cleanTheFloor();
    }

    private void cleanTheFloor() {
        System.out.println("Floor has been cleared.");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColorOfWalls() {
        return colorOfWalls;
    }

    public Bed getBed() {
        return bed;
    }

    public Desk getDesk() {
        return desk;
    }
}
