package QUESTIONs;
// package RECOURSION_QUES.java;
// print all element in reverse order 
public class ARRAY_REVERSE_ORDER {
    static void printArray(int a[],int i){
        if(i==a.length) return;
        printArray(a, i+1);
        System.out.println(a[i]);
        return;
    }
    public static void main(String[] args) {
        printArray(new int[]{1,2,3,4}, 0);
    }
    
}
