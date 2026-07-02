package QUESTIONs;

public class RECURSION_ARRAY {
    public static String recursion_array(String name,int index, String ans){
        if(index > name.length()-1) return ans;
            if(name.charAt(index)!='y'){
                ans = ans + name.charAt(index);
            }
            return recursion_array(name, index+1, ans);
    }
    // public static List printList(){

    // }
    public static void main(String[] args) {
        // String arr[] = {"Ajay","Katik","Divya","a","b","c","d","e","f"};
        String name = "Ajay Tomar";
        // for(int i = 0;i<arr.length;i++){
        //     arr[i] = i;
        // }
        System.out.println(recursion_array(name,0,""));
    }
}
