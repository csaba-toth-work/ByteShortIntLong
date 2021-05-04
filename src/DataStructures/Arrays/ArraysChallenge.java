package DataStructures.Arrays;

import java.util.Scanner;

public class ArraysChallenge {

    public static void main(String[] args) {

        printArray(sortIntegers(getIntegers(5)));

    }

    public static int[] getIntegers(int capacity) {
        System.out.println("Type in " + capacity + " numbers what you want to sort in descending order");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array) {
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("Numbers in descending order");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
