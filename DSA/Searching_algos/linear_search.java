package DSA.Searching_algos;

// A linear mode of searching wherby we compare the target element against all the elements until we find, that is fi it exists.

public class linear_search {
    public static int lin_search(int[] arr, int target) {

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == target) {
                return j + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] myarr = { 5, 7, 3, 4, 24, 16 };
        int x = lin_search(myarr, 3);

        if (x == -1) {
            System.out.println("The element is not found");
        } else {
            System.out.println("The element is found at position " + x + " in the list");
        }

    }
}
