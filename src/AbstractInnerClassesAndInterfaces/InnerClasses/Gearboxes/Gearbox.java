package AbstractInnerClassesAndInterfaces.InnerClasses.Gearboxes;

import java.util.ArrayList;
import java.util.List;

public class Gearbox {
    private List<Gear> gears;
    private int maxGears;
    private int currentGear = 0;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears =  new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public class Gear {
        private int gearNumber;
        private double ration;

        public Gear(int gearNumber, double ration) {
            this.gearNumber = gearNumber;
            this.ration = ration;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ration);
        }
    }
}
