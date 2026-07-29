package CYCLIC_SORT;

public class DUPLICATE_NUMBER {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int duplicate(int arr[]) {
        // int i = 0;
        // int t = 0;
        // while (i < arr.length) {
        // if (i != arr[i]) {
        // swap(arr, i, arr[i]);
        // t++;
        // } else
        // i++;
        // if (t == arr.length)
        // break;
        // }
        // return arr[0];
        while (true) {
            if (arr[0] == arr[arr[0]])
                return arr[0];
            swap(arr, 0, arr[0]);
        }
    }

    public static void main(String[] args) {
        int ans = duplicate(new int[] { 1, 1, 3, 4 });
        System.out.println(ans);
    }
}
