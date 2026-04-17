package sort;

import java.util.Arrays;

public class BubbleSort {

    public static void swap(int ind1, int ind2, int[] arr) {
        int tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
    }

    public static void bubbleSort(int[] arr) {
        for (int pos = 0; pos < arr.length - 1; pos++) {
            // FILL IN CODE:
            // start at the end and go to pos,
            // bubble the smallest element
            // of the subarray to pos


        }
    }

    public static void bubbleSortDescending(int[] arr) {
        for (int pos = 0; pos < arr.length - 1; pos++) {
            // start at the end and go to pos,
            // bubble the current largest element to the front
            // FILL IN CODE:



        }
    }

    public static void bubbleSortPushDownLargest(int[] arr) {
        // Modify bubble sort to push down the largest element to the end of the list
        if (arr == null)
            return;
        for (int pos = arr.length - 1; pos > 0; pos--) {
            // bubble down the current largest element to pos
            // FILL IN CODE

        }

    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 1, 2, 4};
        System.out.println("Before:");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        //bubbleSortPushDownLargest(arr);
        System.out.println("After:");
        System.out.println(Arrays.toString(arr));

    }
}
