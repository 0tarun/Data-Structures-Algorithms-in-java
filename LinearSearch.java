public class LinearSearch {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 7 };
        int target = 3;
        linearSearch(arr, target);
    }

    //Time complicity=(0)n

    public static void linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Target =" + arr[i]);
                break;
            }

        }

    }
}
