package ref;

public class varChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a값 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
