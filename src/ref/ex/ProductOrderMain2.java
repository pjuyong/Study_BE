package ref.ex;

public class ProductOrderMain2 {
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void PrintOrder(ProductOrder[] orders) {
        for (int i = 0; i < orders.length; i++) {
            System.out.println("상품 : " + orders[i].productName + ", 가격 : " + orders[i].price + ", 수량 : " + orders[i].quantity);
        }
    }
    static void getTotalPrice(ProductOrder[] orders) {
        int totalPrice = 0;
        for (int i = 0; i < orders.length; i++) {
            totalPrice += orders[i].price * orders[i].quantity;
        }
        System.out.println("총 결제 금액 : " + totalPrice);
    }
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] =createOrder("김치", 5000, 1);
        orders[2] =createOrder("콜라", 1500, 2);
        PrintOrder(orders);
        getTotalPrice(orders);
    }
}
