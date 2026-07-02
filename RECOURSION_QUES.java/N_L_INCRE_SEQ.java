public class N_L_INCRE_SEQ {
    static void printN_K_Seq(int n,int l,String ans,int i){
        // if()
        if(ans.length()==l){
            System.out.println(ans);
            return;
        }
        // if(i>n) return;
        // i++;
        for(int j = i;j<=n;j++){
            printN_K_Seq(n, l, ans+(j), j+1);
            // ++i;
        }
    }
    public static void main(String[] args) {
        // String a = "aaaj";
        // System.out.println(a+(1+1));
        printN_K_Seq(4, 2, "", 1);
    }
}
