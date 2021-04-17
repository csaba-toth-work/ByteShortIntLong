package FirstSteps;

public class ByteShortIntLongDoubleFloat {

    public static void main(String[] args) {

	    int myValue = 10000;

	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Minimum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1)) ;
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2147483647;
        
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value =  " + myMinByteValue);
        System.out.println("Byte Maximum Value =  " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value =  " + myMinShortValue);
        System.out.println("Short Maximum Value =  " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value =  " + myMinLongValue);
        System.out.println("Long Maximum Value =  " + myMaxLongValue);
        long bigLongLiteralValue = 2147483647234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);


        //1. Challenge

        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 30;
        long myTotalValue = 50000L + (10 * (myByteValue + myShortValue + myIntValue));

        short shortTotal = (short) (1000 + 10 * (myByteValue + myShortValue + myIntValue));

        int myIntVal = 5 / 2;
        float myFloatVal =5f / 2f;
        double myDoubleVal = 5.00 / 2.00;
        System.out.println("MyIntValue = " + myIntVal );
        System.out.println("MyFloatValue = " + myFloatVal);
        System.out.println("MyDoubleValue =" + myDoubleVal);


        //2. Challenge
        int pounds = 200;
        double convertedToKilograms = pounds * 0.45359237;
        System.out.println(pounds + " pounds is equal to " + convertedToKilograms + " kilograms.");

        double pi = 3.1415927d;
        double anotherNumber = 3000000.4567890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
