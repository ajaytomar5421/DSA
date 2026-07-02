import java.util.Scanner;

public class MAZE_PATH {
    // this function use array so it is not optimize
    public static int mazeFun(int [][]arr){
        //  i did a mistake here that arr.lenght == 0 i was comapring lenght with 0 instead of 1 
        if(arr.length == 1) return 1;
        else if(arr[0].length == 1) return 1;
        return mazeFun(new int[arr.length-1][arr[0].length]) + mazeFun(new int[arr.length][arr[0].length-1]);
    }

    public static int mazeFun2(int m,int n){
        if(m==1 || n == 1) return 1;
       int result =  (mazeFun2(m-1, n) + mazeFun2(m, n-1));
       return result;
    }
    public static void main(String[] args) {
        int arr[][] = new int[3][2];
        System.out.println("No of path is : "+ mazeFun(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m and n : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(mazeFun2(m, n));
        sc.close();
    }
}
