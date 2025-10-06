// find the duplicate number 
public class DUPLICATE_NUMBER {
    public static void main(String[] args) {
        int arr[] = {1,5,2,5,7,9};
        for(int i = 0;i <arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Missing number is  : "+ arr[j]);
                    break;
                }
            }
        }
    }
}
