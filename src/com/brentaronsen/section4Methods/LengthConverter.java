package com.brentaronsen.section4Methods;

public class LengthConverter {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        return ((feet * 12) + inches) * 2.54; //total inches * 2.54 = centimeters
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = Math.floor(inches / 12);
        double remainingInches = inches % 12;

        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
