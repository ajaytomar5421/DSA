public class PRE_IN_POST {
    public static void  pip(int num){
        if(num==0) return;
        System.out.println(num);
        pip(num-1);
        System.out.println(num);
        pip(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        pip(2);
       
    }
}
