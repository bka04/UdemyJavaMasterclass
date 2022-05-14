package com.brentaronsen.section8ArraysLists;

import java.util.Scanner;

public class SortedArray {

    public static int[] sortIntegers(int[] arrayToSort) {
        int[] sortedArray;
        sortedArray = arrayToSort.clone();

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i=0; i<sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i+1];
                    sortedArray[i+1] = sortedArray[i];
                    sortedArray[i] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static int[] getIntegers(int arraySize) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[arraySize];

        System.out.println("Enter " + arraySize + " values:\r");
        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
