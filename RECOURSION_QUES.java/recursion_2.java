// package QUESTIONs;
// stair path problem using recursion
public class recursion_2 {
    static int n_stairs(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        // if(n==1||n==2){
        //     return n;
        // }
        // if(n==3) return 4;
        return (n_stairs(n-1)+ n_stairs(n-2)+ n_stairs(n-3));
    }
    public static void main(String[] args) {
        System.out.println(n_stairs(4));
    }
}
