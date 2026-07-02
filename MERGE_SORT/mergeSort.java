package MERGE_SORT;

public class mergeSort {
    public static void merge(int arr[]) {
        int n = arr.length;

        if (n == 1)
            return;

        int a[] = new int[n / 2];
        int b[] = new int[n - n / 2];

        for (int i = 0; i < n / 2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < (n - n / 2); i++) {
            b[i] = arr[i + n / 2];
        }
        merge(a);
        merge(b);

        TWO_SORTED_ARRAYS.sorted_Arr(a, b, arr);
        // for reducing space complexity
        a = null;
        b = null;

    }

    public static void main(String[] args) {
        int a[] = { 6, 3, 7, 2, 5, 4 };
        merge(a);
        for (int i : a) {
            System.out.println(i + " ");
        }
    }
}
