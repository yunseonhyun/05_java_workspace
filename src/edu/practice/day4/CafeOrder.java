package edu.practice.day4;

public class CafeOrder {

    // 필드
    private String customerName;
    private String menuItem;
    private int price;
    private int orderNumber = 0;


    public static int totalOrders = 0;
    public static int totalSales = 0;

    public static final String CAFE_NAME = "코딩카페";
    public static final double TAX_RATE = 0.1;

    // static 초기화 블록
    static {
        System.out.println("=== " + CAFE_NAME + " 시스템 시작 ===");

    }


    // 기본생성자
    public CafeOrder() {
    }

    // 필수생성자

    public CafeOrder(String customerName, String menuItem, int price, int orderNumber) {
        this.customerName = customerName;
        this.menuItem = menuItem;
        this.price = price;
        this.orderNumber = orderNumber;
    }

    // setter
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    // getter
    public String getCustomerName() {
        return customerName;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public int getPrice() {
        return price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    // 기능



    public void printReceipt() {
        System.out.println("주문번호 : " + getOrderNumber());
        totalOrders = getOrderNumber();
        System.out.println("고객명 : " + getCustomerName());
        System.out.println("메뉴 : " + getMenuItem());
        System.out.println("금액 : " + getPrice() + "원");
        System.out.println("세금 : " + (int)(getPrice() * TAX_RATE) + "원");
        System.out.println("총액 : " + (getPrice() + (int)(getPrice() * TAX_RATE)) + "원");
    }

    public void placeOrder() {
        totalOrders =  getOrderNumber();
        totalSales = (getPrice() + (int)(getPrice() * TAX_RATE));
        System.out.println("현재 총 주문수 : " +  totalOrders);
        System.out.println("현재 총 매출 : " +  totalSales + "원");
    }


}
