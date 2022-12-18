package DSA.Sorting_algos;

import java.util.Arrays;

public class merge_sort {

    public static void merge(int a[], int l[], int r[], int nL, int nR) {
        // int nL = l.length;
        // int nR = r.length;

        int i, j, k;
        i = j = k = 0;

        while (i < nL && j < nR) {
            if (l[i] <= r[j]) {
                a[k] = l[i];
                k++;
                i++;
            } else {
                a[k] = r[j];
                k++;
                j++;
            }
        }

        while (i < nL) {
            a[k] = l[i];
            k++;
            i++;
        }
        while (j < nR) {
            a[k] = r[j];
            k++;
            j++;
        }

    }

    public static void mergeSort(int a[]) {
        int n = a.length;

        if (n == 1) {
            return;
        }
        int mid = n / 2;

        int nL = mid;
        int nR = n - mid;

        int[] left = new int[nL];
        int[] right = new int[nR];

        for (int i = 0; i < mid; i++) {
            left[i] = a[i];
        }

        for (int j = mid; j < n; j++) {
            right[j - mid] = a[j];
        }

        mergeSort(left);
        mergeSort(right);
        merge(a, left, right, nL, nR);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 8, 1, 7, 10, 6, 12, 18, 4, 9 };

        mergeSort(arr);

        System.out.println("Your sorted array is: " + Arrays.toString(arr));
    }

}
