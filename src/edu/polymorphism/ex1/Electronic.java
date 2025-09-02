package edu.polymorphism.ex1;

public class Electronic extends Product {
    // 전자제품 관련 필드들
    private int warranty; // 보증기간
    private String powerConsumption; // 전력소비량

    // {} 형태로된 블록 접기 펼치기 단축키
    // ctrl + shift + + or - 접기 펼치기 가능
    // 생성자
    public Electronic() {
    }

    public Electronic(int warranty, String powerConsumption) {
        this.warranty = warranty;
        this.powerConsumption = powerConsumption;
    }

    public Electronic(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
    }

    public Electronic(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight, int warranty, String powerConsumption) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
        this.warranty = warranty;
        this.powerConsumption = powerConsumption;
    }


    // 게터 세터
    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
