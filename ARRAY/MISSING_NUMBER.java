// Find the Missing number in array and array is in series
public class MISSING_NUMBER {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7,8};
        int i=0;
        // time complexity is  : O(n)
        // Space complexity is : O(1) as iam not using any extra array
        for(int num : arr){
            i++;
            if(num == i){
                continue;
            }else{
                System.out.println("Missing number is : " + i);
                i++;
            }
        }
        
        // Another approach using formula
        int len = arr.length;
        int sumOfArray = 0;
        int sumOfElement = ((len+1)*(len+2))/2;
        // int sumOfArray = 0;
        for(int j= 0;j<len;j++){
            sumOfArray+=arr[j];
        }
        System.out.println("Missing number is : "+ (sumOfElement-sumOfArray));

    }
}
