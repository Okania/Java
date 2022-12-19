package DSA.Sorting_algos;

import java.util.Arrays;

public class quick_sort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int a[], int start, int end) {

        int pivot = a[end];

        int i = (start - 1);

        for (int j = start; j < end; j++) {
            if (a[j] < pivot) {
                i++;
                swap(a, i, j);
            }
        }

        swap(a, i + 1, end);
        return i + 1;
    }

    public static void quickSort(int arr[], int start, int end) {
        if (start < end) {
            int pIndex = partition(arr, start, end);

            quickSort(arr, start, pIndex - 1);
            quickSort(arr, pIndex + 1, end);
        }
    }

    public static void main(String[] args) {
        int myArray[] = { 40, 80, 30, 90, 10, 70, 50 };

        int start = 0;
        int end = (myArray.length - 1);

        quickSort(myArray, start, end);

        System.out.println("Your sorted array is: " + Arrays.toString(myArray));

    }

}
