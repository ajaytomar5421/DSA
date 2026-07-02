package QUESTIONs;
//  Print index of a given element in an array. If not present, print -1.
public class recursion_4 {
    // static boolean flag = false;
    static int printIndex(int a[],int num,int n){
        // if(n==a.length && flag == false) return -1;
        if(n==a.length) return -1;
        if(a[n]==num){
            // flag = true;
            return n;
        }
        return printIndex(a, num, n+1);
    }
    public static void main(String[] args) {
        int ans = printIndex(new int[]{1,2,3,4}, 5, 0);
        System.out.println(ans);
    }
}
