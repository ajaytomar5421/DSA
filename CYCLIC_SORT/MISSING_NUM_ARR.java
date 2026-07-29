package CYCLIC_SORT;

import java.util.ArrayList;
import java.util.List;

public class MISSING_NUM_ARR {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static List<Integer> list = new ArrayList<>();

    public static List<Integer> listArr(int arr[]) {
        int i = 0;
        // while (i <= arr.length) {
        // if ((arr[i]) == arr[arr[i]])
        // list.add(arr[i]);
        // if (arr[i] != (i + 1))
        // swap(arr, i, arr[i] - 1);
        // else
        // i++;
        // }
        // return list;
        while (i < arr.length) {
            if (i + 1 == (arr[i]) || arr[i] == arr[arr[i] - 1])
                i++;
            else
                swap(arr, i, arr[i] - 1);
        }
        for (i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i])
                list.add(i + 1);
        }
        return list;

    }

    public static void main(String[] args) {
        System.out.println(listArr(new int[] { 1, 2, 3, 3, 4, 4, 5 }));
    }
}
