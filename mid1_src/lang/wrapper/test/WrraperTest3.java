package lang.wrapper.test;

public class WrraperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer integer1 = Integer.valueOf(str);
        System.out.println("str -> Integer : " + integer1);

        int intValue = integer1.intValue();
        System.out.println("Integer -> int : " + intValue);

        Integer integer2 = Integer.valueOf(intValue);
        System.out.println("int -> Integer : " + integer2);

    }
}
