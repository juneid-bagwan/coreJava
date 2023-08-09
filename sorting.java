import java.util.Arrays;

public class sorting {

    public static int searchInsertIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 6, 5};
        int target = 5;

        // Sorting the array
        Arrays.sort(A);

        // Find the index or the index where it should be inserted
        int result = searchInsertIndex(A, target);

        System.out.println(result);
    }

}
