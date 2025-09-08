package edu.practice.day9;

/**
 * Java 9일차 Map, 컬렉션 실습문제 실행 클래스
 * 각 문제의 주석을 해제하고 실행하세요
 */

public class PracticeRun {
    public static void main(String[] args) {
        PracticeRun runner = new PracticeRun();
        System.out.println("=== Java 9일차 Map, 컬렉션 실습문제 실행 ===");

        // 각 메서드 주석을 해제하고 실행해보세요
         runner.productManager();
         runner.memberPointManager();

    }

    public void productManager() {

        System.out.println("\n=== ProductManager 테스트 ===");

        ProductManager pm = new ProductManager();

        System.out.println("--- 초기 상품 목록 ---");
        pm.displayAllProducts();

        System.out.println("\n--- 상품 검색 테스트 ---");
        pm.searchProduct("P001");
        pm.searchProduct("P999");

        System.out.println("\n--- 상품 추가 테스트 ---");
        pm.addProduct("P004", "맥북프로", 2500000);
        pm.addProduct("P001", "갤럭시S24", 1200000); // 중복 테스트

        System.out.println("\n--- 상품 삭제 테스트 ---");
        pm.removeProduct("P003");
        pm.removeProduct("P999"); // 없는 상품 테스트

        System.out.println("\n--- 최종 상품 목록 ---");
        pm.displayAllProducts();
    }

    public void memberPointManager() {
        System.out.println("\n=== MemberPointManager 테스트 ===");

        MemberPointManager mpm = new MemberPointManager();

        System.out.println("--- 초기 회원 목록 ---");
        mpm.displayAllMembers();

        System.out.println("\n--- 신규 회원 등록 테스트 ---");
        mpm.registerMember("user04");
        mpm.registerMember("user01"); // 중복 테스트

        System.out.println("\n--- 포인트 적립 테스트 ---");
        mpm.earnPoints("user01", 500);
        mpm.earnPoints("user99", 100); // 없는 회원

        System.out.println("\n--- 포인트 사용 테스트 ---");
        mpm.usePoints("user02", 1000);
        mpm.usePoints("user02", 1000); // 포인트 부족 테스트

        System.out.println("\n--- 최종 회원 목록 ---");
        mpm.displayAllMembers();
    }
}


