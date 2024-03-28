package org.example;

import java.util.Arrays;
import java.util.SortedMap;

public class ArraysInJava {
    public static void main(String[] args) {

    }

    static void singleDimensionArray() {
        int[] array; //defining the array
        int[] array1 = new int[10];//defining and creating array
        int[] array2 = {1, 2, 3, 4, 5};//defining and creating array using literals
    }

    static void multiDimensionArray() {
        int[][] array2d = new int[10][10];// defining 2d array
        int[][] array2dAndInit = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };// defining 2d array
        int[][][] array3d = new int[10][10][10];// defining 3d array
    }

    static void printArray() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void printArrayForEach() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void printArrayBackwards() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = array.length - 1; i <= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void sprint2DArray() {
        int[][] array2dAndInit = {
                {10, 20, 30, 40, 50},
                {11, 22, 33, 44, 55},
                {12, 23, 34, 45, 56},
                {13, 24, 35, 46, 57},
                {14, 25, 36, 47, 58}
        };// defining 2d array
        for (int i = 0; i < array2dAndInit.length; i++) {
            for (int j = 0; j < array2dAndInit[i].length; j++) {
                System.out.print(array2dAndInit[i][j] + " ");
            }
            System.out.println();
        }
    }

    // using Arrays utility
    static void usingArrayToPrint() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(array));
    }

    static void usingArrayToPrint2D() {
        int[][] array2dAndInit = {
                {10, 20, 30, 40, 50},
                {11, 22, 33, 44, 55},
                {12, 23, 34, 45, 56},
                {13, 24, 35, 46, 57},
                {14, 25, 36, 47, 58}
        };
        System.out.println(Arrays.deepToString(array2dAndInit));
    }

    static void searchArray() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int foundAtIndex = Arrays.binarySearch(array, 3);
        System.out.println("Found at index " + foundAtIndex);
    }

    static void sortArray() {
        int[] array = {0, 3, 1, 6, 7, 5, 4, 2, 8, 9};
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(array));
    }

    static void bubbleSort() {

    }
}
