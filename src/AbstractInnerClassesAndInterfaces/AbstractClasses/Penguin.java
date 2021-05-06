package AbstractInnerClassesAndInterfaces.AbstractClasses;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Im not really good at at that, can i go for a swim instead?");
    }
}
