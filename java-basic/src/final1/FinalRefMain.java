package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        // data = new Data(); 오류

        data.value = 10;
        data.value = 20;
    }
}
