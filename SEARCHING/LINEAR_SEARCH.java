// Time Complexity O(n)
// Space Complexity O(1)
package SEARCHING;

import java.util.Scanner;

public class LINEAR_SEARCH {
    public static void main(String[] args) {
        int arr[] = {2,3,1,4,7,0,8,9};
        Scanner sc = new Scanner(System.in);

        // Target Element 
        System.out.print("Enter the element : ");
        int num = sc.nextInt();
        boolean flag = false;

        // Implementation of linear Search
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==num){
                flag = true;
                System.out.println("Element found at : "+ i);
                break;
            }
        }
        
        if(flag = false){
            System.out.println("Element not found ");
        }
        sc.close();
    }
}
