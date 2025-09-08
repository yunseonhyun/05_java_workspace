package edu.practice.day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StoreInventoryManager {

    public void method3() {
        Map<String, Integer> inventoryMap = new HashMap<>(); // 상품명 : 재고수량
        Map<String, Integer> priceMap = new HashMap<>();     // 상품명 : 가격
        Scanner sc = new Scanner(System.in);

        // 초기 재고 데이터
        inventoryMap.put("사과", 50);
        inventoryMap.put("바나나", 30);
        inventoryMap.put("오렌지", 0); // 재고 없음
        priceMap.put("사과", 1000);
        priceMap.put("바나나", 1500);
        priceMap.put("오렌지", 2000);

        System.out.print("구매할 상품명을 입력하세요: ");
        String name = sc.nextLine();
        if(!inventoryMap.containsKey(name) || name == null) {
            System.out.println("상품이 존재하지 않습니다");
            return;
        }
        System.out.print("구매할 수량을 입력하세요: ");
        int num = sc.nextInt();
        sc.nextLine();

        try {
            if(num > inventoryMap.get(name)) {
                throw new RuntimeException();
            } else {
                System.out.println("총 가격 : " + (num * priceMap.get(name)));
                inventoryMap.put(name, inventoryMap.get(name) - num);
            }
        } catch (RuntimeException e) {
            System.out.println("재고가 부족합니다.");
        } catch (Exception e) {
            System.out.println("예상치 못한 오류 발생");
        } finally {
            sc.close();
            System.out.println("재고관리 완료");
        }


        // 상품명 존재 여부 확인
        // 수량 입력 시 NumberFormatException 처리
        // 재고 부족 시 RuntimeException 발생 및 처리
        // 재고 차감 및 총 가격 계산
        // finally에서 Scanner 종료 및 "재고 관리 완료" 메시지

    }

}
