package DSA.Searching_algos;

import java.util.Arrays;

public class binary_search {
    public static int bin_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] myarr = { 7, 3, 4, 1, 6, 5, 18, 34 };
        Arrays.sort(myarr);

        int x = bin_search(myarr, 7);

        if (x == -1) {
            System.out.println("The element is not found");
        } else {
            System.out.println("The element is found at position " + (x + 1) + " in the list");
        }
    }
}
