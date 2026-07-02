public class REVERSE_NUMBER {
    static int ans;
    static int reverseNum(int num){
        // if no. start with 0 it consider as octal value
        // System.out.println(num);
        if( num==0) return 0;
        // if(num/10==0) return num;
        ans *=10;
        ans = ans+(num%10);
        /**int a =*/ reverseNum(num/10);
        return ans;
        // if(a/10==0 && num/10==1){
        //     ans *=10;
        //     ans = ans + a;
        // }
        // return ans;
    }
    static int reverseNum2(int num,int rev){
        return 0;
    }
    public static void main(String[] args) {
    //     long x =09;
    //    System.out.println(9); 
       System.out.println(reverseNum(1232001)); 
    }
}