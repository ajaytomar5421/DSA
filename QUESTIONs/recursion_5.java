package QUESTIONs;
// Count and Say
public class recursion_5 {
    static String countAndSay(int n){
        if(n<=0) return "wrong value";
        if(n==1) return "1";
        String s = countAndSay(n-1);
        String ans = "";
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }else{
                ans+=s.valueOf(s.charAt(i))+(j-i);
                i = j;
            }
        }
        return ans += s.valueOf(s.charAt(i))+(j-i);
    }
    public static void main(String[] args) {
        System.out.println(countAndSay(0));
    }
}
