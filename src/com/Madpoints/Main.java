package com.Madpoints;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

	    printIntArray(sortIntArray(getIntArray()));
    }


    public static int[] getIntArray() {

        System.out.println("Enter a length for a integer array: ");
        int length =  scanner.nextInt();

        System.out.println("Enter " + length + " integer values:\r");
        int[] intArray = new int[length];

        for (int i = 0; i < length; i++) {
            intArray[i] = scanner.nextInt();
        }

        return intArray;
    }

    public static int[] sortIntArray(int[] intArray) {

        Arrays.sort(intArray);
        int[] sortedIntArray = new int[intArray.length];
        int index = 0;

        for (int i = intArray.length; i > 0; i--) {
            sortedIntArray[index] = intArray[i-1];
            index++;
        }

        return sortedIntArray;
    }

    public static void printIntArray(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + ": " + intArray[i]);
        }
    }
}
