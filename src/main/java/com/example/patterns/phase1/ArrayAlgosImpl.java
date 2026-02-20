package com.example.patterns.phase1;

import java.util.Arrays;

public class ArrayAlgosImpl {

    public static void main(String[] args) {
        int [] myArray = {9,8,7,6,3,2,1};
        System.out.println(Arrays.toString(myArray));
        int [] sorted = insertionSortV2(myArray);
        System.out.println("Sorted: " + Arrays.toString(sorted));
    }

    public static int [] insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
            int currentVal = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > currentVal) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentVal;
        }
        return arr;
    }

    public static int [] insertionSortV2(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
            int currentVal = arr[i];
            int j = i;
            while (j > 0 && arr[j-1] > currentVal) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = currentVal;
        }
        return arr;
    }
}
