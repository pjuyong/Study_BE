package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data(); // new로 생성하면 참조값이 나옴
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);

        // data는 아무것도 참조하지 않고 있음. 해당 인스턴스에 접근할 방법이 없음.
        // 아무도 참조하지 않는 인스턴스는 메모리 용량만 차지할 뿐이다. (메모리 낭비)
        // Java는 아무도 참조하지 않는 인스턴스가 있다면 JVM의 GC(가비지 컬렉션)가 더이상 사용하지 않는 인스턴스라고 판단하고 자동으로 메모리에서 삭제
    }
}
