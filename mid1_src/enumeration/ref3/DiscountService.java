package enumeration.ref3;

public class DiscountService {
    public int discount(Grade grade, int price) {
        return grade.discount(price); // 할인 적용되는 금액
    }
}
