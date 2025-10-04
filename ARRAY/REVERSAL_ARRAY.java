public class REVERSAL_ARRAY {
    public static void main(String[] args) {
        int arr[]= {1,23,4,5,6};
        int i=0;
        int j=arr.length-1;
        int temp;
        // while (i<(arr.length)/2) {
        //     temp = arr[i];
        //     arr[i]= arr[j];
        //     arr[j]=temp;
        //     i++;
        //     j--;
        // }
        for(i=0;i<=j/2;i++){
            temp = arr[i];
            arr[i]=arr[j-i];
            arr[j-i]= temp;
        }
        for (int k : arr) {
            System.out.println(k);
        }
        // System.out.println(arr);
    }
}
