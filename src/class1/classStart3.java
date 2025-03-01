package class1;

public class classStart3 {
    public static void main(String[] args) {
        Student student1; // 변수 선언
        student1 = new Student(); // Student 객체1 생성 (x001)
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // Student 객체2 생성 (x002)
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1); // 참조 값
        System.out.println(student2); // 참조 값

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);
    }
}
