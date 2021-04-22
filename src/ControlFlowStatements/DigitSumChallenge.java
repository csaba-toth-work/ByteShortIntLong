package ControlFlowStatements;

public class DigitSumChallenge {

    public static void main(String[] args) {

        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            while (number > 0) {
                // extract the least-significant digit
                int digit = number % 10;
                sum += digit;
                // drop the least-significant digit
                number /= 10;
            }
            return sum;
        }
        return -1;
    }
}
