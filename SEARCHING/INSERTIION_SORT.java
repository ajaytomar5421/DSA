package SEARCHING;

import java.util.Scanner;

public class INSERTIION_SORT {
    public static void insertion_sort(int []arr){
        for(int i = 1; i<arr.length; i++){
            int j = i;
            while (j>0 && arr[j]<arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(" "+ arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // size of the array
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        // declaring  the value of arrat
        System.out.println("Enter the value of array: ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
         insertion_sort(arr);
    }
}
