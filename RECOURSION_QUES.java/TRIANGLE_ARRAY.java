// package QUESTIONs;
import java.util.ArrayList;
import java.util.List;
public class TRIANGLE_ARRAY {
    static void trianleArray(List<Integer> a){
        if (a == null || a.isEmpty()) return;
        if(a.size()==1){
            System.out.println(a);
            return;
        }
        List<Integer> l = new ArrayList<>();
        System.out.println(a);
        for(int i = 1;i<a.size();i++){
            l.add(a.get(i)+a.get(i-1));
        }
        trianleArray(l);
    }
    public static void main(String[] args) {
        trianleArray(new ArrayList<>((List.of(1,2,3,4))));
        
    }
}
