package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("입금 금액 : " + amount + ", 현재 잔고 : " + balance);
    }

    void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("출금 금액 : " + amount + ", 현재 잔고 : " + balance);
        } else {
            System.out.println("출금 금액 : " + amount + ", 잔액 부족");
        }
    }
}
