package com.brentaronsen.section5ControlFlow;

public class Exercises {


    //21
    public static void printFactors(int x) {
        if (x < 1) {
            System.out.println("Invalid Value");
            return;
        }
        int factor = 1;
        while (factor <= x) {
            if (x % factor == 0) {
                System.out.println(factor);
            }
            factor++;
        }

    }



    //20
    public static int getGreatestCommonDivisor(int x, int y) {
        if (x < 10 || y < 10) {
            return -1; //invalid input
        }
        int z = Integer.min(x, y);
        while (z > 0) {
            if (x % z == 0 && y % z == 0) {
                return z;
            }
            z--;
        }
        return -1;
    }


    //19
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (!isValid(x) || !isValid(y) || !isValid(z)) {
            return false;
        }

        String string1 = String.valueOf(x); //covert to string
        String string2 = String.valueOf(y); //covert to string
        String string3 = String.valueOf(z); //covert to string

        String rightDigit1 = string1.substring(string1.length() - 1);
        String rightDigit2 = string2.substring(string2.length() - 1);
        String rightDigit3 = string3.substring(string3.length() - 1);

        return (rightDigit1.equals(rightDigit2) || rightDigit1.equals(rightDigit3) || rightDigit2.equals(rightDigit3));
    }

    public static boolean isValid(int x) {
        return (x >= 10 && x <= 1000);
    }

    //18
    public static boolean hasSharedDigit (int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        String string1 = String.valueOf(number1); //covert to string
        String string2 = String.valueOf(number2); //covert to string
        int i = string1.length();

        while (i > 0) {
            String digit1 = string1.substring(i - 1, i);
            int j = string2.length();
            while(j > 0) {
                String digit2 = string2.substring(j - 1, j);
                if (Integer.parseInt(digit1) == Integer.parseInt(digit2)) {
                    System.out.println(digit1 + " is the same as " + digit2);
                    return true; //if digit is the same, return true!
                } else {
                    System.out.println(digit1 + " is not the same as " + digit2);
                }
                j--;
            }
            i--;
        }
        return false;
    }


    //17
    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }

        String string = String.valueOf(number); //covert to string
        int i = string.length();
        int digit = 0;
        int sumEvenDigits = 0;

        while (i > 0) {
            digit = Integer.parseInt(string.substring(i - 1, i));
            if (digit % 2 == 0) {
                sumEvenDigits += digit;
            }
            i--;
        }
        return sumEvenDigits;
    }

    //16
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        String string = String.valueOf(number); //covert to string
        int stringLength = string.length();

        int firstDigit = Integer.parseInt(string.substring(0, 1));
        int lastDigit = Integer.parseInt(string.substring(stringLength - 1));

        return firstDigit + lastDigit;
    }

    //15
    public static boolean isPalindrome(int number)  {

        String string = String.valueOf(Math.abs(number)); //absolute value, then convert to string
        String newString ="";

        int i = string.length();

        while (i > 0) {
            newString += string.substring(i - 1, i);
            i--;
        }
        return (Integer.parseInt(string) == Integer.parseInt(newString));
    }


    //14
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }

        return !(number % 2 == 0);
    }

    public static int sumOdd (int start, int end) {
        if (end < start || end <=0 || start <=0) {
            return -1; //invalid input
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
