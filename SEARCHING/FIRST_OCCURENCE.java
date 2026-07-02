// Finding the first occurencr of the target element and array is sorted
// BINARY SEARCH MODIFICATION
// Time Commplexity : O(log n)
// space Complexity : O(1)
package SEARCHING;

import java.util.Scanner;

public class FIRST_OCCURENCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,3,4,7,7,9,9};
        int low = 0, high = arr.length, mid = low + (high - low)/2;
        System.out.println("Enter the target : ");
        int idx = sc.nextInt();
        // boolean flag = false;
        // problem implementation 
        // -----This is My solution which is not optimize because i used 2 loops
        /**
         *  while (mid > 0)  and == here is i should use high > low nor mid > 0 ==
         *  {
            if(arr[mid] == idx){
                while (arr[mid] == arr[mid-1]) {
                    mid-=1;
                }
                System.out.println("Elememnt are found at " + mid);
                flag = true;
                break;
            }
            else if(arr[mid]<idx){
                low = mid+1;
                mid = low + (high - low)/2;
            }
            else {
                high = mid - 1;
                mid = low + (high - low)/2;
            }
        }
        if(flag == false){
            System.out.println("Element not found");
        }
    }
            */
     // ===== OPTIMIZE WAY =========
     int result = -1;
        while (high >= low) {
            if(arr[mid] == idx){
                result = mid;
                // Traverse to the left side of the array
                high = mid - 1;
                mid = low + (high - low)/2;
            }
            else if(arr[mid]>idx){
                high = mid - 1;
                mid = low + (high - low)/2;
            }
            else{
                low = mid + 1;
                 mid = low + (high - low)/2;
            }
            }
            System.out.println("element index is : "+ result);
            sc.close();
        }
    }

