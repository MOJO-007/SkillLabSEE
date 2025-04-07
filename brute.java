import java.util.Arrays;

public class brute {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int k = 2;

        Arrays.sort(arr);

        int kthSmallest = arr[k - 1];
        int kthLargest = arr[arr.length - k];

        System.out.println("Kth Smallest Element: " + kthSmallest);
        System.out.println("Kth Largest Element: " + kthLargest);
    }
}