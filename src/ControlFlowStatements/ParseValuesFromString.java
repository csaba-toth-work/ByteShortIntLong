package ControlFlowStatements;

import javax.swing.*;

public class ParseValuesFromString {

    public static void main(String[] args) {

        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println( "number = " + number);

        numberAsString += 1; //concating the values because its a String
        number +=1; //adding the values

        System.out.println("numberAsString = " + numberAsString);
        System.out.println( "number = " + number);


        String numberAsString2 = "2018.54";
        double number2 = Double.parseDouble(numberAsString2);
        System.out.println( "number2 = " + number2);


    }
}
