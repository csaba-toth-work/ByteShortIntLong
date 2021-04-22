package ControlFlowStatements;

public class WhileAndDoWhileStatement {

    public static void main(String[] args) {
        // checks the conditions before executing the block
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        //    init   condition    increment
        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            count++;
            System.out.println("Count value is " + count);
        }


        // do while statement is always executed at least once
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }
        } while (count != 6);


        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound == 5) {
                break;
            }
        }
        System.out.println("Total number of even numbers found : " + evenNumbersFound);

        // continue = bypass the part of cde block that is below and continue with the next iteration
        // break = exit the loop
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
