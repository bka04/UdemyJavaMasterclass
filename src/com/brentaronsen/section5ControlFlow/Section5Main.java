package com.brentaronsen.section5ControlFlow;

public class Section5Main {

    public static void section5Main() {
        // Lecture stuff SECTION 5
//        findPrimes(3, 20, 90);

//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//
//        for(int i=2; i<9; i++) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//        }
//
//        DayOfTheWeek.printDayOfTheWeek(2);
//
//        char letter = 'F';
//
//        switch(letter) {
//
//            case 'A': case 'B': case 'C': case 'D': case 'E':
//                System.out.println("Found A, B, C, D, or E (specifically: " + letter + ")");
//                break;
//            default:
//                System.out.println("Not found.");
//        }
//        int switchValue = 4;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("was a 3, 4, or 5");
//                System.out.println("Actually it was " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//
//        }
    }

    public static void findPrimes(int primesToFind, int lowerBound, int upperBound) {
        for(int i=lowerBound; i <= upperBound && primesToFind > 0; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                primesToFind--;
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
