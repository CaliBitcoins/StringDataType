package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // Primitive Data Types
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // String is java data type, but not a primitive. It is a <<< Class >>>
        // String is a sequence of characters limited only by the MAX_VALUE of an int (2.14 Billion)
        // Strings in Java are Immutable - cannot change String after it is created only create a new one
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        // String value can be changed and saved inline
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        // Unicode escape characters work with String as well
        myString = myString + " \u00A9 2019";
        System.out.println(myString);

        // Mathematical operators do not function on Strings
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        // Doesn't matter if you add an int numeric value to the equation
        int testInt = 50;
        double testDouble = 122.54d;
        String testStr = "10";
        System.out.println("testStr(10) + testInt(50) = " + (testStr +testInt));
        System.out.println("testStr(10) + tesDouble(122.54d) = " + (testStr +testDouble));

    }
}
