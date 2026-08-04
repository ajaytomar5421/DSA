// leetcode 41 find the first smallest missing positive number 
package CYCLIC_SORT;

public class LEETCODE_41 {
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void cyclicSort(int arr[]){
        int len = arr.length;
        int i = 0;
        while(i<len){
            // it ignore duplicate, > 0, < lenght and if elment is at its correct position
            if(i+1 == arr[i] || arr[i]>=len || arr[i]<=0 || arr[i] == arr[arr[i]-1]) i++;
            else{
                swap(arr,i,arr[i]);
            }
        }
    }
       public static int firstMissingPositive(int[] arr) {
        cyclicSort(arr);
        int i;
        for( i = 0;i<arr.length;i++){
            if(i+1 != arr[i]) return i+1;
            // else continue;
        }
        return i+1;
        //  if(arr.length == arr[0]) return arr.length+1;
        //  else return arr.length;
    }
     public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{0,0,0,3,4}));
     }
}