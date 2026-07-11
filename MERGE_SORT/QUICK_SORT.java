package MERGE_SORT;

// this quick sort can not solve  4 2 4 1 4 
// time complexity = O(n*logn)
// space complexity = O(logn) ~ O(1)
// worst case TC = O(n^2) and SC = O(n)
public class QUICK_SORT {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // public static void partition(int arr[], int low, int high, int index) {

    // int pivot = arr[index];

    // int i = low;
    // int j = high;

    // while (i < index && j > index) {

    // while (i < index && arr[i] < pivot)
    // i++;

    // while (j > index && arr[j] > pivot)
    // j--;

    // if (i < index && j > index) {
    // swap(arr, i, j);
    // i++;
    // j--;
    // }
    // }
    // }
    public static void partition(int arr[], int i, int j, int index) {
        while (i < index && j > index) {
            int pivot = arr[index];

            if (arr[i] < pivot)
                i++;
            else if (arr[j] > pivot)
                j--;
            else if (arr[i] > arr[index] && arr[j] < arr[index]) {
                // else {
                swap(arr, i, j);
                i++;
                j--;
            } else if (arr[i] == arr[index]) {
                i++;
            } else if (arr[j] == arr[index]) {
                j--;
            }
        }

    }

    public static void quick_sort(int arr[], int low, int high) {
        if (low >= high)
            return;
        // for considering arr[0] as pivot
        // int pivot = arr[low];
        // for randomized pivot element
        int mid = (low + high) / 2;
        int pivot = arr[mid];
        int index = low;
        for (int i = low; i <= high; i++) {
            if (i == mid)
                continue;
            if (arr[i] < pivot)
                index++;
        }
        System.out.println(index);
        // intially here was low not pivot
        swap(arr, mid, index);
        partition(arr, low, high, index);
        quick_sort(arr, low, index - 1);
        quick_sort(arr, index + 1, high);
    }

    public static void quick(int arr[], int low, int high) {
        int start = low;
        int end = high;
        // forget base case
        if (low >= high)
            return;
        int pivot = arr[low];
        // my error position start from low not zero
        int postion = low;
        for (int i = low; i < high; i++) {
            if (pivot > arr[i]) {
                postion++;
            }
        }
        if (postion != low) {
            int temp = arr[postion];
            arr[postion] = arr[low];
            arr[low] = temp;
        }
        while (low < high) {
            if (arr[low] > pivot && pivot > arr[high]) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            } else if (arr[low] > pivot && arr[high] > pivot) {
                high--;
            } else if (arr[low] < pivot && arr[high] < pivot) {
                low++;
            } else {
                low++;
                high--;
            }
        }
        // here i used pivot(X) used index of pivot nor pivot value
        quick(arr, start, postion - 1);
        quick(arr, postion + 1, end);
    }

    public static void main(String[] args) {
        // int arr[] = { 3, 2, 1, 5, 7, 6, 8 };
        // int arr[] = { 8, 1, 6, 4, 5, 7, 3 };
        int arr[] = { 4, 2, 4, 1, 4 };
        // quick(arr, 0, arr.length - 1);
        quick_sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
