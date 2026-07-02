// Time complexity : O(n2)
// SPace Complexity : O(1)
// it is better than bubble sort because it take less swap 
package SEARCHING;

import java.util.Arrays;

public class SELECTION_SORT {
    // Implementation of selection sort
    public static void selectionSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            // min_idx take index of min element at each iteration
            int min_idx = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[min_idx]>arr[j]){
                    min_idx = j;
                }
            }
            if(min_idx != i){
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
        // final result
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {11,2,3,14,66,5,98,77};
        // function call
        selectionSort(arr);
    }
}
