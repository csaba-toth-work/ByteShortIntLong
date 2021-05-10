package classes.encapsulationchallenge;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(true);
        printer.print(9);
        System.out.println(printer.getPagesPrinted());
        printer.getTonerLevel();
        printer.refillToner();


    }
}
