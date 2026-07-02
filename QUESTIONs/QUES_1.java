// it can be optimiz e using hashmap
package QUESTIONs;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int idx = -1;
        // TC => O(n2)
        // for(int i = 0; i<nums.length; i++){
        //     for(int j = i+1; j< nums.length; j++){
        //         idx = target - nums[i];
        //         // if(idx + nums[j] == target){ my logix before
        //         if(idx == nums[j]){
        //             return new int[]{i ,j}; // we have to return indexs not the value
        //         }
        //     }
        // }
        // optimize way ===========> TC = O(n)
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i <nums.length;i++){
             int temp = target - nums[i];
             if(hm.containsKey(temp)){
                return new int []{hm.get(temp),i};
             }
             hm.put(nums[i],i);

        }
        return new int[]{};
    }
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array : ");
    int size  = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the array : ");
    for(int i = 0;i<size;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the target : ");
    int target  = sc.nextInt();
    int result [] = twoSum(arr,target);
    if(result.length == 0){
        System.out.println("No pair");
    }
    else{
    System.out.println(Arrays.toString(result));
    }
}
}
