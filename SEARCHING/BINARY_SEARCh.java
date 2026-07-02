// Time Complexity O(logn)
// Space Complexity O(1)
package SEARCHING;

import java.util.Scanner;

public class BINARY_SEARCh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array " );
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array");
        for(int i = 0;i< size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target Element : ");
        int idx = sc.nextInt();
        int low = 0;
        int high = arr.length;
        int mid =  low + (high - low)/2;
        boolean flag = false;
        // Acutall Implementation 
        while (mid > 0) {
            if(arr[mid] == idx)
            {
                System.out.println("Element found at : "+ mid);
                flag = true;
                break;
            }
            else if(arr[mid]<idx){
                low = mid + 1;
                mid = low + (high - low)/2;

            }
            else if(arr[mid]>idx){
                high = mid - 1;
                mid = low + (high - low)/2;
            }
        }
        if(flag == false){
            System.out.println("Element not found");
        }
        sc.close();
    }
}
