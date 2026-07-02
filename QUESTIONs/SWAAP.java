package QUESTIONs;

public class SWAAP {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a +" " +b);
        if(a == 1) System.out.println("EVEN");
        else System.out.println("Odd");
    }
}
