// Time Complexity : O(2^n)
// Space Complexity : O(n)
import java.util.Scanner;

public class FIBONACCI {
    public static int fibonacciFind(int num){
        // int c = a+b;
        // a = b;
        // b = c;
       if(num == 0 || num == 1){
        return num;
       }
    //    else if(num==1) return 1;
       else
       return (fibonacciFind(num-1)+fibonacciFind(num-2));

    // if(num == 0) return c;
    // else if(num ==1) return c;
    // else {fibonacciFind(num-1, a, b);
    //     return c;
    // }

    }
    public static void main(String[] args) {
        System.out.println("Enter the number : " );
        Scanner sc = new Scanner(System.in);
        // int a = 0, b =1;
        int num = sc.nextInt();
        System.out.println(fibonacciFind(num));
        sc.close();
    }
}

