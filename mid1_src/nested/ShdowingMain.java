package nested;

public class ShdowingMain {
    public int value = 1;

    class Inner {
        int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("shdowing.value = " + ShdowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShdowingMain m = new ShdowingMain();
        Inner inner = m.new Inner();
        inner.go();
    }
}
