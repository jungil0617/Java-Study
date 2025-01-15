package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10;
        // data1 = 20; 오류류
        final int data2 = 20;
        // data2 = 30; 오류

        method(10);
    }
    static void method(final int parameter) {
        // parameter = 20; 오류
    }
}
