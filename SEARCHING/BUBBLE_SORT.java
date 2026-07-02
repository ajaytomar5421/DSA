// Time Compelxity : O(n2)
// Space complexity : O(1)
// it is not that good because it take more no. of swaps
package SEARCHING;

import java.util.Arrays;
import java.util.Scanner;

public class BUBBLE_SORT {
    public static String sortedArray(int arr[]){
         // ==  bubble sort Implementation  ==
        for(int i = 1; i<arr.length; i++){
            boolean flag = false;
            // at every iteration biggest element placed at last
            for(int j=0; j<arr.length-i; j++){
                if(arr[j]>arr[j+1]){
                    flag = true;
                    // swapping the element
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
            if(flag == false){
                break;
            }
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        // array size
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter array element : ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }


        //  final result
        String sol = sortedArray(arr); 
        System.out.print("Sorted array is : " + sol);
        // for(int i = 0;i < arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        sc.close();

    }
}
