public class GENERATE_PARANTHESIS {
    // wrong appriach
    static void printParenthesis1(String s,int n,int k){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(s.isEmpty()) printParenthesis1(s+"()", n, k);
        if(!s.isEmpty() && s.length()< 2*n){
            printParenthesis1('('+s+')', n, k);
            printParenthesis1(s+"()", n, k);
        }

    }
    // correct approach
    static void printParenthesis(String s,int opening,int closing,int n){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
    if(opening<n) printParenthesis(s+"(", opening+1, closing, n);
    if(closing<opening) printParenthesis(s+")", opening, closing+1, n);

        // if(s.length() == 2*n && opening == closing){
        //     System.out.println(s);
        //     return;
        // }
        //  /**s.charAt(s.length()-1)=='('*/
        // if(s.isEmpty() || (opening == closing && opening <= n) ){
        //     printParenthesis(s+'(', opening+1, closing, n);
        // }
        // else if(opening > closing && opening <=n) {
        //     printParenthesis(s+'(', opening+1, closing, n);
        //     printParenthesis(s+')', opening, closing+1, n);
        // }
        // return;

    }
    public static void main(String[] args) {
        printParenthesis("", 0, 0, 2);
        // printParenthesis1("", 2, 0);
    }
}
