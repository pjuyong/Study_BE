package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수
        final int data1 = 10;
        // data1 = 20; // 최초 한번만 할당 가능

        // final 지역 변수2
        final int data2 = 20;
        method(10);
    }

    static void method(final int parameter) {
        // parameter = 20; // compile error
    }
}
