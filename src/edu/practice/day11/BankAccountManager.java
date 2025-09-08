package edu.practice.day11;

import practice.exception.ex.UserNotFoundException;

import java.util.*;

public class BankAccountManager {

    public void method2() {
        Map<String, Integer> accountMap = new HashMap<>(); // 계좌번호 : 잔액
        Map<String, String> ownerMap = new HashMap<>();   // 계좌번호 : 예금주명
        Scanner sc = new Scanner(System.in);

        // 초기 데이터
        accountMap.put("1001-2345", 50000);
        accountMap.put("2002-3456", 75000);
        accountMap.put("3003-4567", 120000);
        ownerMap.put("1001-2345", "김철수");
        ownerMap.put("2002-3456", "이영희");
        ownerMap.put("3003-4567", "박민수");

        System.out.print("계좌번호를 입력하세요: ");
        String account = sc.nextLine();
        if(!accountMap.containsKey(account)){
            System.out.println("일치하는 계좌가 없습니다.");
            return;
        }
        System.out.print("출금할 금액을 입력하세요: ");
        int price = sc.nextInt();
        sc.nextLine();


        System.out.print("계좌 번호 주인의 성함을 입력하세요 : ");
        String 계좌주인이름  = sc.nextLine();
        // 계좌번호애서 가져온 계좌 주인이 일치하는지 일치하지 않은지 확인
        // 일치하지 않으면 UserNotFoundException을 이용하여
        // 일치하는 계좌의 주인이 존재하지 않습니다. 출력

        try {
            if(!ownerMap.get(account).equals(계좌주인이름)){
                throw new UserNotFoundException();
            } else{}
        } catch (UserNotFoundException e) {
            System.out.println("일치하는 계좌의 주인이 존재하지 않습니다.");
        } catch (Exception e) {
            System.out.println("예상치 못한 오류 발생");
        }

        try {
            if(price > accountMap.get(account)){
                throw new IllegalArgumentException();
            } else {
                System.out.println("출금이 완료되었습니다.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("잔액이 부족합니다.");;
        } catch (Exception e) {
            System.out.println("개발자가 예상 못한 오류 발생");;
        } finally {
            sc.close();
            System.out.println("거래 완료");
        }



    }

}
