package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요 : ");
        int n = scanner.nextInt();

        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < orders.length; i++) {
            System.out.println(i+1 + "번째 주문 정보를 입력허세요.");
            System.out.print("상품명 : ");
            String productName = scanner.next();
            System.out.print("가격 : ");
            int price = scanner.nextInt();
            System.out.print("수량 : ");
            int quantity = scanner.nextInt();
            orders[i] = createOrder(productName, price, quantity);
        }

        PrintOrder(orders);
        getTotalPrice(orders);
    }
}
