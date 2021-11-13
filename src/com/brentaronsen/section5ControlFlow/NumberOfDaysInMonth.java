package com.brentaronsen.section5ControlFlow;

public class NumberOfDaysInMonth {
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

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1; //invalid year
        }
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1; //invalid month
        }
    }
}
