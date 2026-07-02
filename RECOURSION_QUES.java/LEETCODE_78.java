import java.util.List;
import java.util.ArrayList;
public class LEETCODE_78 {
   static List<List<Integer>> ans = new ArrayList();
    static void printSubset(int a[],ArrayList arr,int index){
        if(index > a.length) return;
        else{
            List l = new ArrayList<>();
            for(int i=0;i<arr.size();i++){
                l.add(arr.get(i));
            }
            if(!ans.contains(arr)){
            ans.add(l);
            }
        }

        for(int i=index;i<a.length;i++){
            arr.add(a[i]);
            printSubset(a, arr,i+1);
            arr.remove(arr.size()-1);
            
        }
        // return;
    }
    public static void main(String[] args) {
        int a[] = new int[]{4,4,4,1,4};
        printSubset(a, new ArrayList<>(), 0);
        System.out.println(ans);
    }
}
// [,[1,4,4],[1,4,4,4],[1,4,4,4,4]]
// [ [4, 4, 4, 1], [4, 4, 4, 1, 4], , [4, 4, 1], [4, 4, 1, 4], [4, 1], [4, 1, 4], ]