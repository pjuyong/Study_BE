package oop1.ex;

public class RextangleOopMain2 {
    public static void main(String[] args) {
        RectangleCorrect rectangle2 = new RectangleCorrect();
        rectangle2.width = 5;
        rectangle2.height = 8;

        int area = rectangle2.calculateArea();
        System.out.println("넓이 : " + area);

        int perimeter = rectangle2.calculatePerimeter();
        System.out.println("둘레 : " + perimeter);

        boolean square = rectangle2.isSquare();
        System.out.println("정사각형 여부 : " + square);

    }
}
