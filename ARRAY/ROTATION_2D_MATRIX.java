 import java.util.Arrays;

public class ROTATION_2D_MATRIX {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,0},{4,5,6,0},{7,8,9,0},{4,3,2,1}}; 
        // int arr1[][] = new int[][]{{1,2,3},{4,5,6}};
        // System.out.println(arr.length);
        // System.out.println(arr[0].length);
        System.out.println("----------------Before rotation----------------------------");
        int temp;
              for(int i =0;i<arr.length;i++){
            for(int j= 0;j<arr[i].length;j++){
             System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------Middle rotation----------------------------");

        for(int i =0;i<arr.length;i++){
            for(int j= i;j<arr[i].length;j++){
                // simple swaping of the element in array
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }
        for(int i =0;i<arr.length;i++){
            for(int j= 0;j<arr[i].length;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        
        for(int i=0;i<arr.length;i++){
            int j=0;
            int k=arr[i].length-1;
            int temp1;
            while(j!=(arr[i].length/2)){
                temp1 = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp1;
                j++;
                k--;
            }
        }
        
        System.out.println("------------------final part-----------------"); 
          for(int i =0;i<arr.length;i++){
            for(int j= 0;j<arr[i].length;j++){
             System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }

        for (var is : arr) {
            System.out.println(Arrays.toString(is));
        }
    }
}
