// package RECURSION;
public class PERMUTATION {
    static String support;
    static void permuString(String ans,String s){
          if(s.isEmpty()){
                System.out.println(ans);
                return;
            }
        for(int i = 0;i<s.length();i++){
            // ans+=s.charAt(i);
            char ch = s.charAt(i);
            support = s;
            // support=support.replace(s.valueOf(ch), ""); it is wrong cause it remove all occurence
            support = s.substring(0, i) + s.substring(i+1);
            permuString(ans+ch, support);
        
            // ans = ans.replace(ans.valueOf(ans.charAt(i)), "");
        }
        return;
    }
    public static void main(String[] args) {
        permuString("", "abc");
        
    }
}
