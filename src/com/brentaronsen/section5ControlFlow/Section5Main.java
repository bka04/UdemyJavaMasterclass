package com.brentaronsen.section5ControlFlow;

import java.util.Scanner;

public class Section5Main {

    public static void section5Main() {
        // Section 5 Exercises
        //Exercise 25
//        System.out.println(Exercises.getLargestPrime(16));
//        System.out.println(Exercises.getLargestPrime(21));
//        System.out.println(Exercises.getLargestPrime(217));
//        System.out.println(Exercises.getLargestPrime(0));
//        System.out.println(Exercises.getLargestPrime(45));
//        System.out.println(Exercises.getLargestPrime(-1));

        // Exercise 24
//        System.out.println(Exercises.canPack(1, 0, 4));
//        System.out.println(Exercises.canPack(1, 0, 5));
//        System.out.println(Exercises.canPack(0, 5, 4));
//        System.out.println(Exercises.canPack(2, 2, 11));

        // Exercise 22
//        System.out.println(Exercises.isPerfectNumber(28));
//        System.out.println(Exercises.isPerfectNumber(5));

        // Exercise 21
//        Exercises.printFactors(32);

        // Exercise 20
//        System.out.println(Exercises.getGreatestCommonDivisor(25, 15));

        // Exercise 19
//        System.out.println(Exercises.hasSameLastDigit(41, 22, 71));

        // Exercise 18
//        System.out.println(Exercises.hasSharedDigit(12, 13));

        // Exercise 17
//        System.out.println(Exercises.getEvenDigitSum(123456));

        // Exercise 16
//        System.out.println(Exercises.sumFirstAndLastDigit(6));
//        System.out.println(Exercises.sumFirstAndLastDigit(987));

        // Exercise 15
//        System.out.println(Exercises.isPalindrome(1235));
//        System.out.println(Exercises.isPalindrome(1227221));
//        System.out.println(Exercises.isPalindrome(-343));

        // Sum Digits challenge
//        System.out.println(LectureChallenges.sumDigits(14423));

        // Exercise 14
//        System.out.println(Exercises.sumOdd(1, 7));

        // Sum 3 and 5 Challenge
        // LectureChallenges.threeAndFive();

        // Exercise 13
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));

        // Exercise 12
//        NumberInWord.printNumberInWord(3);

        //Exercise 10
//        IntEqualityPrinter.printEqual(1, 1, 1);
//        IntEqualityPrinter.printEqual(1, 1, 2);
//        IntEqualityPrinter.printEqual(-1, 1, 1);
//        IntEqualityPrinter.printEqual(1, 2, 3);

        //Exercise 9
//        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
//        MinutesToYearsDaysCalculator.printYearsAndDays(561600);

        //Exercise 8
//        System.out.println(AreaCalculator.area(4.6));
//        System.out.println(AreaCalculator.area(4, 5));

        //Overloading Exercise
//        System.out.println(LengthConverter.calcFeetAndInchesToCentimeters(13, 7));
//        System.out.println(LengthConverter.calcFeetAndInchesToCentimeters(37));

        //Exercise 7
//        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));

        //Exercise 6
//        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1)); //false
//        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2)); //true
//        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0)); //true

        //Exercise 5
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175)); //true
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176)); //false
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0)); //true
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123)); //false

        //Exercise 4
//        System.out.println(LeapYear.isLeapYear(-1600));
//        System.out.println(LeapYear.isLeapYear(1600));
//        System.out.println(LeapYear.isLeapYear(1700));
//        System.out.println(LeapYear.isLeapYear(2003));
//        System.out.println(LeapYear.isLeapYear(2004));

        //Exercise 3
//        System.out.println(BarkingDog.shouldWakeUp(true, 1));
//        System.out.println(BarkingDog.shouldWakeUp(false, 2));

        //Exercise 2
//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        //Exercise 1
//        System.out.println(SpeedConverter.toMilesPerHour(1.25));
//        SpeedConverter.printConversion(10.25);



        // Lecture stuff SECTION 5
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); //handle next line character (enter key)

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        int age = 2022 - yearOfBirth;

        System.out.println("Your name is " + name + " and you are " + age + " years old.");

        scanner.close(); //done with the scanner. Release underlying memory scanner was using.


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
//    }

//    public static void findPrimes(int primesToFind, int lowerBound, int upperBound) {
//        for(int i=lowerBound; i <= upperBound && primesToFind > 0; i++) {
//            if(isPrime(i)) {
//                System.out.println(i);
//                primesToFind--;
//            }
//        }
//    }
//
//    public static boolean isPrime(int n) {
//        if(n==1) {
//            return false;
//        }
//
//        for(int i=2; i <= n/2; i++) {
//            if(n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static double calculateInterest(double amount, double interestRate) {
//        return(amount * (interestRate/100));
//    }

    }
}
