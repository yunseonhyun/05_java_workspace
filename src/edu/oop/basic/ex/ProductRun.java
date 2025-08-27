package edu.oop.basic.ex;

public class ProductRun {
    public static void main(String[] args) {
        Product pr1 =  new Product();
        pr1.setpName("갤럭시 S24");
        pr1.setPrice(1200000);
        pr1.setBrand("삼성");

        Product pr2 =  new Product();
        pr2.setpName("아이폰 15");
        pr2.setPrice(1300000);
        pr2.setBrand("애플");

        System.out.println("=== p1 실행결과 ===");
        pr1.information();
        System.out.println("\n=== p2 실행결과 ===");
        pr2.information();
    }
}
