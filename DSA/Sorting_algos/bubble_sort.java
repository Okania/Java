package DSA.Sorting_algos;

// In the bubble sort algorithm we compare elements one by one and sort them according to their values.

import java.util.Arrays;

public class bubble_sort {
    public static void bubbleSort(int arr[]) {

        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 8, 1, 7, 10, 6, 12, 18, 4, 9 };
        bubbleSort(arr);

        System.out.println("Your sorted array is: " + Arrays.toString(arr));
    }

}
