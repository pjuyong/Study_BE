package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3; // 메소드 영역
    private int outInstanceValue = 2; // x001

    static class Nested { // 메서드 영역
        private int nestedInstanceValue = 1; // x002

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근
            //System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 접근 가능
            System.out.println(NestedOuter.outClassValue);
        }
    }
}
