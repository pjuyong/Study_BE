package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // spit()
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        // join()
        String joinedStr = String.join("-","A","b","c");
        System.out.println("연결된 문자열 : " + joinedStr);

        String result = String.join("-", split);
        System.out.println("result : " + result);

    }
}
