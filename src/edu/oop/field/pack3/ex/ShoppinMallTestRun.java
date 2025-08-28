package edu.oop.field.pack3.ex;

public class ShoppinMallTestRun {
    public static void main(String[] args) {
        // main에서 가장 최초로 실행하는 것은 static !!!! 임을 발견!!!!

        // 1. 3명의 회원 객체 생성
        // 자료형은         공간의         member1이라는 공간 내부에
        // member1         명칭          작성될 수 있는 데이터와
        // 공간의 크기                    사용 가능한 기능을 member1에 넣어서 사용
        ShoppingMallMember member1 = new ShoppingMallMember();
        ShoppingMallMember member2 = new ShoppingMallMember();
        ShoppingMallMember member3 = new ShoppingMallMember();

        // 2. 회원 정보 설정
        member1.setMemberId("user001");
        member1.setMemberName("김쇼핑");
        member1.setEmail("kim@email.com");


        member2.setMemberId("user002");
        member2.setMemberName("박구매");
        member2.setEmail("park@email.com");

        member3.setMemberId("user003");
        member3.setMemberName("이주문");
        member3.setEmail("lee@email.com");

        // 3. 회원가입 및 방문 시뮬레이션
        System.out.println("회원가입 진행");
        member1.joinMember();
        member2.joinMember();
        member3.joinMember();

        // 4. 사이트 방문
        member1.visitSite();
        member1.visitSite(); // 김쇼핑 웹사이트 2번 방문
        member2.visitSite();
        member3.visitSite();
        member3.visitSite();
        member3.visitSite(); // 이주문 웹사이트에 3번 방문

        System.out.println("김쇼핑님이 회원가입 하셨습니다. (회원번호)");
        System.out.println("----- 회원가입 후 통계 -----");
        System.out.println("전체 회원수 :" + ShoppingMallMember.totalMemberCount + "명");
        System.out.println("일일 방문자 수 :" + ShoppingMallMember.dailyVisitorCount + "명");
        System.out.println("=== 쇼핑몰 운영 정보 ===");
        System.out.println("쇼핑몰명 :" + ShoppingMallMember.SHOPPING_MALL_NAME);
        System.out.println("고객센터 : " + ShoppingMallMember.SERVICE_CENTER_NUMBER);
        System.out.println("최대 장바구니 수 :" + ShoppingMallMember.MAX_CART_ITEMS + "개");
        System.out.println("최소 비밀번호 길이 : "+ ShoppingMallMember.MIN_PASSWORD_LENGTH + "자");

        // 장바구니와 개별 회원정보 기능을 활용하기
        System.out.println("********** 회원별 장바구니 정보 *********");
        member1.addToCart(10); // member1은 장바구니에 10개 아이템을 담음
        member2.addToCart(25); // member2은 장바구니에 25개 아이템을 담음
        member3.addToCart(60); // member3은 장바구니에 60개 아이템을 담음
                                        // 장바구니는 최대 50개 담을 수 있으므로 장바구니 초과 조회
        System.out.println("********** 개별 회원 정보 *********");
        member1.printMemberInfo();
        member2.printMemberInfo();
        member3.printMemberInfo(); // 이주문씨는 장바구니 갯수 초과로 물건을 담으르 수 없어 0 으로 조회


        /**
         * Q1. member1으로 호출했을 때 왜 totalMemberCount에 경고가 나타날까요? 자동완성이 안될까요?
         * System.out.println("전체 회원수 :" + member1.totalMemberCount + "명");
         */
    }
}
