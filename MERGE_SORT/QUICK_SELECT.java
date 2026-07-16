package MERGE_SORT;

// Find Kth smallest or largest number
public class QUICK_SELECT {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void partition(int arr[], int idx, int i, int j) {
        while (i < idx && j > idx) {
            if (arr[i] <= arr[idx])
                i++;
            if (arr[j] >= arr[idx])
                j--;
            if (arr[i] > arr[idx] && arr[j] < arr[idx]) {
                swap(arr, i, j);
                i++;
                j--;
            }
            // else {
            // i++;
            // j--;
            // }
        }

    }

    public static void quick(int arr[], int low, int high) {
        if (low >= high)
            return;
        int pivot = arr[low];
        int idx = low;
        for (int i = low + 1; i <= high; i++) {
            if (pivot > arr[i])
                idx++;
        }
        // if (low >= high) {
        // if (arr[idx - 1] == arr[high - k + 1])
        // return arr[idx - 1];
        // else if (arr[idx + 1] == arr[high - k + 1])
        // return arr[idx + 1];
        // }
        // return arr[idx];
        swap(arr, low, idx);
        partition(arr, idx, low, high);
        quick(arr, idx + 1, high);
        quick(arr, low, idx - 1);
    }

    public static int quick(int arr[], int k, int low, int high) {
        int pivot = arr[low];
        int idx = low;
        for (int i = low + 1; i <= high; i++) {
            if (pivot > arr[i])
                idx++;
        }

        // if (low >= high) {
        // if (arr[idx - 1] == arr[high - k + 1])
        // return arr[idx - 1];
        // else if (arr[idx + 1] == arr[high - k + 1])
        // return arr[idx + 1];
        // }
        // return arr[idx];
        swap(arr, low, idx);
        if (k == idx)
            return arr[idx];
        if (low >= high)
            return arr[idx];
        // if ((high - k + 1) == idx) k must not change this is my mistake

        partition(arr, idx, low, high);
        // if ((high - k + 1) > idx) k must not change mistake
        if (k > idx)
            return quick(arr, k, idx + 1, high);
        else
            return quick(arr, k, low, idx - 1);

        // return 0;
    }
    // this is something else

    public static void main(String[] args) {
        // int arr[] = { 4, 2, 4, 1, 4 };
        int arr[] = { 4, 1, 2, 3, 7, 6, 8, 9 };
        int k = arr.length - 3;
        quick(arr, 3, 0, arr.length - 1);
        System.out.println(quick(arr, k, 0, arr.length - 1));
        // int x = quick(arr, 0, arr.length - 1);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

    }
}
