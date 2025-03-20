package enumeration.ref1;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100; // 할인 적용되는 금액
    }
}
