package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);
        System.out.println(extIndex);
        String filename = str.substring(0,extIndex);
        String extName = str.substring(extIndex, 9);

        System.out.println("filename : " + filename);
        System.out.println("extName : " + extName);
    }
}
