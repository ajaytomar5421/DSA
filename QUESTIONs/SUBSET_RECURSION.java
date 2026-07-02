package QUESTIONs;

import java.util.ArrayList;
// ===============================================================================
public class SUBSET_RECURSION {
    static public int index1 = 0;
    static String ans ="";
    public static void powerSubset(int i,String str){
        if(i == str.length()) {
            System.out.println(ans);
             return;
        }
        // char ch = str.charAt(i);
        // powerSubset(i+1, str, ans+ch);
        // powerSubset(i+1, str, ans);
        powerSubset(i+1, str);
        // System.out.println(ans+=str.charAt(i));
       ans= ans+str.charAt(i);
        powerSubset(i+1, str);
    }
    // =====================================================================================
    static public ArrayList<String> arr = new ArrayList<>(); 
    public static void printList(int index,String ans,String s){
        if(index == s.length()) {
            arr.add(ans);
            return;
        }
        // char ch =s.charAt(index);

        printList(index+1,ans, s);
        ans +=s.charAt(index);
        printList(index+1, ans, s);


        // return ;
    }
    // ====================================================================================
    public static void main(String[] args) {
        arr = new ArrayList<>(); // because multiple test case run on it on LEETCODE so it has to
        // be new List
        // powerSubset(0, "ab");
        printList(0,"","abc");
        System.out.println(arr);
        int [] arr = new int[]{3,2,1};
        // powerList(0, arr, ar1);
        
    }
}
