package solution;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int curr;
        int j;
        for (int i = 1; i < arr.length; i++) { // goes through unsorted part of the array
            curr = arr[i]; // we will  insert it into the sorted part of the array
            // insert curr into the sorted part of the list
            j = i - 1; // index of the last element in the sorted part
            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;

        }
    }

    public static void insertionSortDecreasingOrder(int[] arr) {
        // Modify insertion sort to sort elements in decreasing order
        int curr;
        int j;
        for (int i = 1; i < arr.length; i++) { // goes through unsorted part of the array
            curr = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] < curr) {  // changed > to <
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;

        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 1, 2, 4, 9, 15, 67, 89, 49, 4, 2, 0};
        System.out.println("Before:");
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        // insertionSortDecreasingOrder(arr);
        System.out.println("After:");

        System.out.println(Arrays.toString(arr));

    }
}
