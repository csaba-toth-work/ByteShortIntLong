package ExpressionsStatementsCodeblocksMethods;

public class SpeedConverter {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(75.114));

        printConversion(75.114);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour * 0.621371);
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0) {
            System.out.println("Invalid speed");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + "mi/h");
        }

    }
}
