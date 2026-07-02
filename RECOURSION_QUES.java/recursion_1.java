// package RECOURSION_QUES;

public class recursion_1 {
    static int sum=0;
    static void twoSum(int a,int b){
        // if(a==b || (a-1)==b) {
        //     if(a==b) System.out.println(sum+a);
        //     else System.out.println(sum);
        //     return;
        // }
        if(a>b){
            System.out.println(sum);
            return;
        }
        // if(a==b || (a-1)==b){
        //     System.out.println(sum+a);
        //     return;
        // }
        if(a%2==0){
            a++;
        }
        sum+=a;
        // System.err.println(sum);
        twoSum(a+2, b);
    }
    static int twoSum1(int a, int b){
        if(a>b) return 0;
        if(a%2==0) a++;
        return a + twoSum1(a+2,b);
    }

    public static void main(String[] args) {
        twoSum(4, 10);
        System.out.println(twoSum1(4, 9));
    }
}



