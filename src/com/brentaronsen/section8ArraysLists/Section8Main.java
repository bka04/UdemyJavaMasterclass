package com.brentaronsen.section8ArraysLists;

//import java.util.Scanner;

public class Section8Main {

//    private static final Scanner scanner = new Scanner(System.in);
    public static void section8Main() {

        int[] myArray = SortedArray.getIntegers(4);
        int[] sortedArray = SortedArray.sortIntegers(myArray);
        SortedArray.printArray(sortedArray);

//        int[] myIntegers = getIntegers(5);
//        printArray(myIntegers);

//        System.out.println("section 8");
//        int[] myIntArray = new int[10];
//        myIntArray[5] = 50;
//        double[] myDoubleArray = new double[10];
//        //System.out.println(myIntArray[5]);
//        int[] mySecondArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        printArray(mySecondArray);
    }

//    public static int[] getIntegers(int number) {
//        System.out.println("Enter " + number + " integer values.\r");
//        int[] values = new int[number];
//
//        for (int i=0; i<values.length; i++) {
//            values[i] = scanner.nextInt();
//        }
//
//        return values;
//    }

//    public static void printArray(int[] array) {
//        for (int i=0; i < array.length; i++) {
//            System.out.println("Element " + i + " value is: " + array[i]);
//        }
//    }
}
