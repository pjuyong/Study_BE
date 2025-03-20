package enumeration.ref2;

public class DiscountService {
    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100; // 할인 적용되는 금액
    }
}
