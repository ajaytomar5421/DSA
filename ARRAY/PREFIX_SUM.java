import java.util.Scanner;

// time complexity is O(m*m)
// space Complexity is O(1)
// this is brute force method which is not optimized method
public class PREFIX_SUM {
    // ------BRUTE FORCE METHOD-------------------
    // public static int prefixSum(int arr[][],int r1,int c1,int r2, int c2){
    //     int sum = 0;
    //     for(int i = r1;i<=r2;i++){
    //         for(int j = c1;j<=c2;j++){
    //             sum+=arr[i][j];
    //         }
    //     }
    //     return sum;
    // }

    // -------------OPTIMIZE VERSION ------------------------
    // here we are adding prefix in the array in row wise
    public static int prefixSumArray(int arr[][],int r1,int c1,int r2,int c2){
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 1;j<n;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }

    // here we are adding prefix in the array in column wise
        for(int j = 0;j<n;j++){
            for(int i = 1;i<m;i++){
                arr[i][j]+=arr[i-1][j];
            }
        }
// this can be change according to the requirement
        int sum = 0, up = 0,left = 0,repeated_regon = 0;
        sum = arr[r2][c2];
        repeated_regon = arr[r1-1][c1-1];
        left = arr[r2][c1-1];
        up = arr[r1-1][c2];
        return sum - up - left + repeated_regon;

     

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Enter the order of matrix : ");
        m = sc.nextInt();
        n = sc.nextInt();
        int arr[][]= new int[m][n];
        System.out.println("Enter the value of matrix : ");
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter 1st indexes : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter 2nd Indexes : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        // int result = prefixSum(arr,r1,c1,r2,c2);
        int result = prefixSumArray(arr, r1, c1, r2, c2);
        System.out.println("The prefix sum of array chosen is : "+ result);
      
        
    }
}