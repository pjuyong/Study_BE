package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final field - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructorInit constructorInit1 = new ConstructorInit(10);
        ConstructorInit constructorInit2 = new ConstructorInit(20);
        System.out.println(constructorInit1.value);
        System.out.println(constructorInit2.value);

        // final field 초기화
        System.out.println("필드 초기화");
        FieldInit ffieldInit1 = new FieldInit();
        FieldInit ffieldInit2 = new FieldInit();
        FieldInit ffieldInit3 = new FieldInit();
        System.out.println(ffieldInit1.value);
        System.out.println(ffieldInit2.value);
        System.out.println(ffieldInit3.value);

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

        System.out.println(Constant.PI);

    }
}
