package enumeration.ref3;

import static enumeration.ref3.Grade.*;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;
        System.out.println("Basic 등급의 할인 금액: " + BASIC.discount(price));
        System.out.println("Gold 등급의 할인 금액 : " + GOLD.discount(price));
        System.out.println("Diamond 등급의 할인 금액 : " + DIAMOND.discount(price));
    }
}
