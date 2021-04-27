package Classes.EncapsulationChallenge;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean isDuplexPrinter;

    public Printer(boolean isDuplexPrinter) {
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void refillToner() {
        if (tonerLevel < 100) {
            tonerLevel = 100;
            System.out.println("The toner has been refilled");
        } else {
            System.out.println("The toner level is on full.");
        }
    }

    public void print(int numberOfPages) {
        if (isDuplexPrinter) {
            int doublePages = (numberOfPages / 2);
            int singlePages = numberOfPages % 2;
            pagesPrinted += doublePages + singlePages;
            System.out.println(doublePages + " double pages and " + singlePages + " single pages has been printed.");

        } else {
            pagesPrinted += numberOfPages;
            System.out.println(numberOfPages + " single pages has been printed");
        }
        tonerLevel -= numberOfPages;
    }

    public int getTonerLevel() {
        System.out.println(tonerLevel + "% toner level.");
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
