// Time Complexity is same and Space complexity is  also same 
package SEARCHING;

import java.util.Scanner;

public class SQUARE_ROOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int low = 0, high = num,mid = low + (high-low)/2;
        int result = 0;
        while(high >= low){
            if((mid*mid)==num){
                result = mid;
                // System.out.println("Square root is : "+ (int)mid);
                break;
            }
            else if((mid*mid)<num){
                low = mid+1;
                // we store lower bound closer to sq root 
                result = mid;
                mid = low + (high-low)/2;
            }
            else if((mid*mid)>num){
                high = mid -1;
                mid = low + (high-low)/2;
                
            }
        }
        System.out.println("Root is  : "+ result);
        sc.close();
    }
}
