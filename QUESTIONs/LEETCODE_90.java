package QUESTIONs;
import java.util.*;

public class LEETCODE_90 {
    static List<List<Integer>> ans;
    static void helper(int index,int nums[],ArrayList arr){
        // ans.add(new ArrayList(arr));
        // if(index > nums.length) return;
        // else{
        //     List l = new ArrayList();
        //     for(int j = 0;j<arr.size();j++){
        //         l.add(arr.get(j));
        //     }
        //     ans.add(l);
        // }
        // if(!ans.contains(arr)){
        ans.add(new ArrayList(arr));
        // }
        

        for(int i = index;i<nums.length;i++){
            // if(i > index && nums[i] == nums[i-1]) continue;
            if(i > index && nums[i] == nums[i - 1]) continue;
            arr.add(nums[i]);
            helper(i+1,nums,arr);
            arr.remove(arr.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
      
        return ans;
    }
    public static void main(String[] args) {
        ans = new ArrayList<>();
        int nums[]= new int[]{1,2,2};
        Arrays.sort(nums);
        helper(0,nums,new ArrayList());
        System.out.println(ans);
    }
}
