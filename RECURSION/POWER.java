import java.util.Scanner;

public class POWER {
    // simple brute force method 
    // Time Complexity : O(n)
    public static int powerfun(int num,int pow){
        if(pow == 0) return 1;
        // else if(pow == 0)return 1;
        else{
            return num*powerfun(num, pow-1);
        }
    }
    //  Lograthmic function  
    // Time Complexity : O(logn)
     public static int powerLog(int num, int pow){
        if(pow == 0) return 1;
        // else if(pow == 0) return 1;
        int result = powerLog(num, pow/2); 
        if(pow % 2 == 0) return result*result;
        else return result*result*num;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the power of num : ");
        int pow = sc.nextInt();
        System.out.println(powerfun(num,pow));
        sc.close();

    }
}
