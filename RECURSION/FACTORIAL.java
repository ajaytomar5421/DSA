import java.util.Scanner;

public class FACTORIAL {
    public static int factorialFun(int num){
        // base condition
        if(num == 1) return 1;
        return num*factorialFun(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the  number : ");
        int num = sc.nextInt();
        // function call
        System.out.println(factorialFun(num));
        sc.close();
    }
}
