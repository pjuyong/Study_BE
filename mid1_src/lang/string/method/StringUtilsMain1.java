package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf()
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값 : " + numString);

        String boolString = String.valueOf(bool);
        System.out.println("불리안의 문자열 값 : " + boolString);

        String objString = String.valueOf(obj);
        System.out.println("불리안의 문자열 값 : " + objString);
    }
}
