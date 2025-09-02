package edu.polymorphism.ex1.model;

public class Clothing extends Product {
    // 의류 관련 필드들
    private String size;
    private String color;
    private String material;

    // 생성자
    public Clothing() {
    }

    public Clothing(String size, String color, String material) {
        this.size = size;
        this.color = color;
        this.material = material;
    }

    public Clothing(String productName, String productId, double productPrice, int productStock, String productDescription, String productBrand, double productWeight) {
        super(productName, productId, productPrice, productStock, productDescription, productBrand, productWeight);
    }

    public Clothing(String productName, String productId, double productPrice, int productStock, String productDescription, String productBrand, double productWeight, String size, String color, String material) {
            // 카테고리를 소비자가 선택해서 고르는 것이 아니라 개발자가 카테고리를 설정하는것
        super(productName, productId, productPrice, productStock, productDescription, productBrand, productWeight);
        this.size = size;
        this.color = color;
        this.material = material;
    }

    // Clothing("면 티셔츠", "SHIRT001", 25000.0, 50, "100% 면 소재", "무신사", 0.3, "L", "화이트", "면");
    // 생성자 'Clothing(String, String, double, int, String, String, double, String, String, String)'을(를) 해결할 수 없습니다

    // 게터 세터
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
