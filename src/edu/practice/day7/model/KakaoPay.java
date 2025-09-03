package edu.practice.day7.model;

public class KakaoPay extends KakaoService {

    private int balance;

    private String bankAccount;

    // 생성자
    public KakaoPay() {
    }

    public KakaoPay(int balance, String bankAccount) {
        this.balance = balance;
        this.bankAccount = bankAccount;
    }

    public KakaoPay(String serviceName, String userId, String userNickname, boolean isLoggedIn, String serviceType) {
        super(serviceName, userId, userNickname, isLoggedIn, serviceType);
    }

    public KakaoPay(String serviceName, String userId, String userNickname, boolean isLoggedIn, String serviceType, int balance, String bankAccount) {
        super(serviceName, userId, userNickname, isLoggedIn, serviceType);
        this.balance = balance;
        this.bankAccount = bankAccount;
    }

    // 게터 세터
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }


    // toString
    @Override
    public String toString() {
        return super.toString() + "KakaoPay{" +
                "balance=" + balance +
                ", bankAccount='" + bankAccount + '\'' +
                '}';
    }

    // 기능
    @Override
    public void startService() {

    }

    @Override
    public void stopService() {

    }

    @Override
    public String getServiceType() {
        return "";
    }

    @Override
    public void performSpecialAction() {
    }
    @Override
    public void sendNotification(String message) {}


    public void showUserInfo() {
        super.showUserInfo();
        System.out.println("잔액: " + balance + "원");
        System.out.println("연결 계좌: " + bankAccount);
    }

    public void chargeBalance(int amount) {}

    public void processPayment(int amount){}

    public void transferMoney(String recipient, int amount){}



}
