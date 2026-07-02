import java.util.Scanner;

public class STRING_0s_1s {
    static void func_01(String ans,int n){
        if(ans.length()==n){ System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)=='0'){
            func_01(ans+"0",n);
            func_01(ans+"1",n);
        }
        else if(ans.length()==0 || ans.charAt(ans.length()-1)=='1'){
            func_01(ans+"0",n);
        }
        // return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        func_01("",n);
        sc.close();

    }
}
