package edu.practice.day9;

import java.util.HashMap;
import java.util.*;

public class ProductManager {
    Map<String, String> productMap =  new HashMap<>();
    Map<String, String> priceMap =  new HashMap<>();

    public void addProduct(String productId, String productName, int price) {
        if(productMap.containsKey(productId)){
            System.out.println("이미 존재하는 상품입니다");
        } else {
            productMap.put(productId, productName);
        }
    }

    public void searchProduct(String productId){
        if(productMap.containsKey(productId)){
            System.out.println("상품ID : " + productId + ", 상품명 : " +  productMap.get(productId) + "가격 : " +   priceMap.get(productId) + "원");
        } else {
            System.out.println("존재하지 않는 상품입니다.");
        }
    }

    public void displayAllProducts(){
        System.out.println("===전체 상품 목록 ===");
        for(Map.Entry<String, String> entry : priceMap.entrySet()){
            System.out.println("상품명 : " + entry.getKey()+ " 상품가격 : " + entry.getValue());
        }
    }

    public void removeProduct(String productId){
        if(productMap.containsKey(productId)){
            productMap.remove(productId);
            System.out.println(productMap.get(productId) + "상품이 삭제되었습니다.");
        } else {
            System.out.println("존재하지 않는 상품 ID입니다.");
        }


    }
}
