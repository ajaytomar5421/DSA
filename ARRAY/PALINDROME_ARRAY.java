
public class PALINDROME_ARRAY{
    public static void main(String[] args) {
// =========================================================================
        // int arr[] = {1,2,2,3,2,2,1};
        // int arr1[] = new int[arr.length];
        // for(int i = 0;i<arr.length;i++){
        //     arr1[i]= arr[i];
        // }
        // boolean flag =false;
        // int i = 0;
        // int j = arr.length-1;
        // while(i != (arr.length-1)){
        //    if(arr[i] == arr1[j]){
        //         i++;
        //         j--;
        //    }
        //    else{
        //         flag =true;
        //         System.out.println("array is not palindrome");
        //         break;
        //    }

        // }

        // if(flag == false){
        //     System.out.println("array is palindrome");
        // }
        // System.err.println("chal ja");
// ===========================================================================
        int array[] = {1,2,3,2,1};
        int i =0;
        int j = array.length-1;
        boolean flag = true;
        while(i==j || i<j){
            if(array[i]==array[j]){
                flag = true;
                i++;
                j--;
            }else{
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }

}