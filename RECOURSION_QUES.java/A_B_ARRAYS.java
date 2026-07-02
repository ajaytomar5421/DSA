// Given two sorted arrays A and B, generate all possible arrays such that the first element is taken from A
// then from B then from A, and so on in increasing order till the arrays are exhausted. The generated arrays
// should end with an element from B.

import java.util.ArrayList;

public class A_B_ARRAYS {
    static void generate(int A[],int B[],ArrayList<Integer> temp,boolean cureentA,int i,int j){
        if(cureentA && temp.size()>=2){
            System.out.println(temp);
        }
        if(cureentA){
            for(int x = i;x<A.length;x++){
                if(temp.isEmpty() || A[x]>temp.get(temp.size()-1)){
                    temp.add(A[x]);
                    generate(A, B, temp, false, x+1, j);
                    temp.remove(temp.size()-1);
                }
            }
        }else{
            for(int y = j;y<B.length;y++){
                if(B[y] > temp.get(temp.size()-1)){
                    temp.add(B[y]);
                    generate(A, B, temp, true, i, y+1);
                    temp.remove(temp.size()-1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int A[] = new int[]{10,15,25};
        int B[] = new int[]{1,5,20,30};
        generate(A, B, new ArrayList<>(), true, 0, 0);
    }
}
