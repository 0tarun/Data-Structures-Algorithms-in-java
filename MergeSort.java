public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };

        Sort(arr, 0, arr.length - 1);
        
        System.out.println("Here is the sorted array");
        for (int elem : arr) {

            System.out.println(elem);
        }

    }

    public static void Sort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            Sort(arr, start, mid);
            Sort(arr, mid + 1, end);
            Merge(arr, start, mid, end);

        }

    }

    public static void Merge(int arr[], int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[start + i];
        }

        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[(mid + 1) + i];
        }
        int m = 0;
        int n = 0;

        int k = start;

        while (m < n1 && n < n2) {
            if (leftArray[m] <= rightArray[n]) {
                arr[k] = leftArray[m];
                m++;
            } else {
                arr[k] = rightArray[n];
                n++;
            }
            k++;
        }

        while (m < n1) {
            arr[k] = leftArray[m];
            m++;
            k++;
        }

        while (n < n2) {
            arr[k] = rightArray[n];
            n++;
            k++;
        }

    }

}
