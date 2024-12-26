package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력해주세요 : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];
        for(int i = 0; i < orders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String productName = scanner.nextLine();

            System.out.print("가격 : ");
            int productPrice = scanner.nextInt();

            System.out.print("수량 : ");
            int productQuantity = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼 제거

            orders[i] = createProductOrder(productName, productPrice, productQuantity);
        }

        printOrders(orders);
        int sum = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + sum);
    }

    static ProductOrder createProductOrder(String productName, int price , int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for(ProductOrder o : orders) {
            System.out.println("상품명: " + o.productName + " 가격: " + o.price + " 수량: " + o.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int Total = 0;
        for(ProductOrder o : orders) {
            Total += o.quantity * o.price;
        }
        return Total;
    }
}
