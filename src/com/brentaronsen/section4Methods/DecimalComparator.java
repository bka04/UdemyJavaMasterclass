package com.brentaronsen.section4Methods;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double doubleOne, double doubleTwo) {
        long resultOne = (long) (doubleOne * 1000);
        long resultTwo = (long) (doubleTwo * 1000);
        return resultOne == resultTwo;
    }
}
