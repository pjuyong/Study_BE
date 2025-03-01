package oop1.ex;

public class Rectangle {
    int width = 5;
    int height = 8;

    void getArea(int x, int y) {
        x = width;
        y = height;
        int area = x * y;
        System.out.println("넓이 : " + area);
    }

    void getParameter(int x, int y) {
        x = width;
        y = height;
        int parameter = 2 * (x + y);
        System.out.println("둘레 길이 : " + parameter);
    }

    void isSquare(int x, int y) {
        boolean square = false;
        if(x == y) {
            square = true;
            System.out.println("정사각형 여부 : " + square);
        } else {
            System.out.println("정사각형 여부 : " + square);
        }
    }
}
