import java.util.Scanner;

public class STAIR_PATH {
    public static int stairFun(int stair){
        if(stair == 3) return 2;
        else if(stair <= 2) return 1;
        return stairFun(stair-1) + stairFun(stair-3);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of stairs : ");
        int stair = sc.nextInt();
        System.out.println("no of ways : "+ stairFun(stair));
        sc.close();
    }
}
