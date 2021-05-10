package classes.compositionchallenge;

import classes.composition.Dimensions;

public class Main {
    public static void main(String[] args) {
        Desk desk = new Desk("black", "metal", new classes.compositionchallenge.Dimensions(1, 2, 1));
        Chair chair = new Chair("brown", "wooden", new classes.compositionchallenge.Dimensions(1, 1, 1));
        Bed bed = new Bed("brown", "wooden", new classes.compositionchallenge.Dimensions(2, 1, 1));

        Room room = new Room(new Dimensions(4, 5, 2), "white", bed, desk, chair);

        room.tidyUpTheRoom(); // access the object not using a getter
        room.getBed().makeTheBed(); // access the object via a getter and public method

        room.getDesk().cover();
    }
}
