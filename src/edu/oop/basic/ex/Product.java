package edu.oop.basic.ex;

public class Product {
    private String pName;
    private int price;
    private String brand;


    // 기본 생성자
    public Product() {
    }


    // setter
    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    // getter
    public String getpName() {
        return pName;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    // 기능
    public void information() {
        System.out.printf("제품명 : %s\n가격 : %d원\n브랜드 : %s\n", getpName(), getPrice(), getBrand());
    }
}
