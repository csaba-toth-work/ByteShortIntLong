package Arrays;

import java.util.Scanner;

public class MinimumElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the amount of numbers");
       int amount =  scanner.nextInt();
       int[] numbers = readIntegers(amount);
        System.out.println(findMin(numbers));

    }

    public static int[] readIntegers(int amount) {
        int[] numbers = new int[amount];
        for (int i = 0; i < amount; i++) {
           numbers[i] = scanner.nextInt();
           scanner.nextLine();
        }
        return numbers;
    }

    public static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i];
           }
        }
        return min;
    }
}
