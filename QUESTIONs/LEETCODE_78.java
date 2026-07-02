package QUESTIONs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LEETCODE_78 {
    // -------------------------------------------
    // this aletrnate way of printing power set compare it yourself
        public static List<List<Integer>> arr1;
    static void helper1(int i,int nums [],ArrayList ans){
        if(i==nums.length){
            // ArrayList list = new ArrayList<>();
            // for(int j = 0;j <ans.size();j++){
            //     list.add(ans.get(j));
            // }
           if(ans.size() == 4) arr1.add(ans);
            return;

        }
        helper1(i+1, nums, ans);
           ArrayList list = new ArrayList<>();
            for(int j = 0;j <ans.size();j++){
                list.add(ans.get(j));
            }
        list.add(nums[i]);
        helper1(i+1, nums, list);
        // list.remove(list.size()-1);
    

    }
    // -------------------------------------------
    // this first method told by my master
    public static List<List<Integer>> arr;
    static void helper(int i,int nums [],ArrayList ans){
        if(i==nums.length){
            ArrayList list = new ArrayList<>();
            for(int j = 0;j <ans.size();j++){
                list.add(ans.get(j));
            }
            // arr.add(list);
             if(!arr.contains(list)){
             arr.add(list);
        }
            return;

        }
        helper(i+1, nums, ans);
        ans.add(nums[i]);
        helper(i+1, nums, ans);
        ans.remove(ans.size()-1);
    

    }
 public static List<List<Integer>> printSet(int [] nums){
    arr = new ArrayList<>();
    helper(0, nums, new ArrayList<>());
    return arr;
        
    }
     // 2nd function for better quality
    //  this is simple without using array
    public static void printNum(int index,String s,String sum){
        if(index == s.length()){
            System.out.println(sum);
            return;
        }
        printNum(index+1, s, sum);
        sum+=s.charAt(index);
        printNum(index+1, s, sum);
    }
    // ============================================
    public static void main(String[] args) {
       List l =  printSet(new int[]{4,4,4,1,4});

       System.out.println(l);
    //------- 2nd function call------
    // printNum(0, "abc", "");
    // ArrayList a1 = new ArrayList<>();
    // ArrayList a2 = new ArrayList<>();
    // a1.add(a2);
    // System.out.println(a1);
    }
}
