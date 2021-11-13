package com.brentaronsen.section5ControlFlow;

public class LectureChallenges {

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        String numberString = String.valueOf(number); //convert number to a string
        String[] letterArr = numberString.split(""); //split into string array of single letters
        int sumDigits = 0;
        for (String letter : letterArr) { //for each letter in letter array
            sumDigits += Integer.parseInt(letter); //convert to int and add to sum of the digits
        }
        return sumDigits;
    }

    public static void threeAndFive() {
        int total = 0;
        int count = 0;
        for(int i = 1; i < 1001; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                System.out.println(i);
                total += i;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum = " + total);
    }
}
