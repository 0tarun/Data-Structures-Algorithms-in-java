

public class BinarrySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 1;
        Search(arr, target, 0, arr.length - 1);

    }

    public static void Search(int[] arr, int target, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
            } else if (arr[mid] > target) {
                Search(arr, target, start, mid - 1);
            } else {
                Search(arr, target, mid + 1, end);
            }

        }

    }

}