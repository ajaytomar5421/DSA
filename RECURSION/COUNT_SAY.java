import java.util.Scanner;

public class COUNT_SAY {
    // static void print(String s,int n,String ans){
    //     if(n==s.length()) return;
    //     if(ans.charAt(0) != s.charAt(n+1)){
    //         System.out.print(ans.charAt(0)+ans.length()+" ");
    //         ans = "";
    //     }
    //     print(s, n+1, ans+s.charAt(n));
    // }
    static String printCount(int n){
        if(n==0) return "bsdk no. daal khali mat bhej";
        if(n==1) return "1";
        String s = printCount(n-1)+"@";
        String ans = "";
        int i = 0; int j = 0;
        while (j<s.length()) {
            if(s.charAt(i) == s.charAt(j)){
                j++;
            }else{
                ans += s.valueOf(s.charAt(i)) + (j-i);
                i = j;
            }
        }
        // ans += s.valueOf(s.charAt(i)) + (j-i);
        return ans;





    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // print("11122233",0,"");
        String a = printCount(4);
        System.out.println(a);
        
    }
}
