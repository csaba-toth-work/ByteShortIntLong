package ControlFlowStatements;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt) {
                break;
            } else {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
            scanner.nextLine();
        }
        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);
        scanner.close();
    }
}
