package AbstractInnerClassesAndInterfaces.InnerClasses.Gearboxes;

public class Main {

    public static void main(String[] args) {
        Gearbox mcLaren =  new Gearbox(6); // outer class
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3); // inner class

        System.out.println(first.driveSpeed(1000));
    }
}
