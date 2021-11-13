package com.brentaronsen.section4Methods;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        //validate input:
        if (year < 1 || year > 9999) {
            return false;
        }

        //test for leap year:
        boolean isLeap = false;
        if (year % 4 == 0) {
            isLeap = true; //leap year! Unless the following exception:
            if (year % 100 == 0 && year % 400 != 0) {
                isLeap = false; //not leap year if divisible by 100 but NOT 400
            }
        }
        return isLeap;
    }
}
