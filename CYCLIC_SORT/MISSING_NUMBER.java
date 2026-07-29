package CYCLIC_SORT;

public class MISSING_NUMBER {
    public static int missNum1(int arr[]) {
        int n = arr.length;
        boolean b[] = new boolean[n + 1];
        for (int ele : arr) {
            b[ele] = true;
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] == false)
                return i;
        }
        return 0;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int cycleSort1(int arr[]) {
        int i = 0;

        while (i < arr.length) {
            // (i < arr.length && arr[i] != i) this was my earlier condition which is wrong
            if (arr[i] == i || arr[i] == arr.length)
                i++;
            else
                swap(arr, i, arr[i]);
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        i = 0;
        while (i < arr.length) {
            if (i != arr[i])
                return i;
            else
                i++;
        }
        return i;
    }

    public static void main(String[] args) {
        // int ans = missNum1(new int[] { 9, 8, 7, 5, 1, 2, 3, 6, 0 });
        // System.out.println(ans);
        // int ans = cycleSort1(new int[] { 3, 2, 1, 5, 9, 8, 7, 6, 0 });
        int ans = cycleSort1(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 });
        System.out.println();
        System.out.println(ans);
    }
}
