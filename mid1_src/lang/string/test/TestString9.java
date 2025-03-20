package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] spilts = email.split("@");
        String id = spilts[0];
        String domain = spilts[1];

        System.out.println("ID : " + id);
        System.out.println("Domain : " + domain);
    }
}
