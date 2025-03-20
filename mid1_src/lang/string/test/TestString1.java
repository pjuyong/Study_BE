package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        /*String url = "https://www.example.com";
        String subString = url.substring(0,8);

        System.out.println(checkStart(subString));*/

        String url = "https://www.example.com";
        boolean result = url.startsWith("https://");
        System.out.println(result);
    }

    /*public static boolean checkStart(String str) {
        if (str.equals("https://")) {
            return true;
        } else {
            return false;
        }
    }*/
}
