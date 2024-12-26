package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createProductOrder("두부", 2000, 2);;
        orders[1] = createProductOrder("김치", 5000, 1);;
        orders[2] = createProductOrder("콜라", 1500, 2);;

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
