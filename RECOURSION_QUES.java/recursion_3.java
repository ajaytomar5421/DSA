// package QUESTIONs;
// given a positive no. return true if it is power of 2
public class recursion_3 {
    // using bit manipulation
    static boolean isPowerOf2(int n){
        return n>0 && (n & (n-1))==0;
    }
    // using recursion
    static boolean multipleOF2(int n){
        if(n<=0) return false;
        if(n==1) return true; // 2^0 = 1
        if(n%2!=0) return false;
        return multipleOF2(n/2);
        
     
    }
    public static void main(String[] args) {
        System.out.println(multipleOF2(64));
        System.out.println(isPowerOf2(64));
        
    }
}
