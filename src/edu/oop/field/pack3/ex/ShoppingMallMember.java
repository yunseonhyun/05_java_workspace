package edu.oop.field.pack3.ex;

public class ShoppingMallMember {
    /* 필드 */

    // static : 공유 정보
    public static int totalMemberCount = 0; // 전체 회원 수
    public static int dailyVisitorCount = 0; // 일일 방문자 수

    // static final : 공통 규정
    public static final String SHOPPING_MALL_NAME = "더조은 온라인 쇼핑몰";
    public static final String SERVICE_CENTER_NUMBER = "1588-1234";
    public static final int MAX_CART_ITEMS = 50; // 최대 장바구니 상품 수(50개)
    public static final int MIN_PASSWORD_LENGTH = 8; // 최소 비밀번호 길이(8자)

    private String memberId; // 회원ID
    private String memberName; // 회원명
    private String email; // 이메일
    private int cartItemCount; // 현재 장바구니 상품 수


    // 초기화 블럭  단일 변수 보다 한단계 늦게 시작
    {
        memberId = "guest123";
        memberName = "게스트";
        email = "guest@tjemail.com";
        cartItemCount = 0;
    }

    // static 초기화 블록
    static {
        totalMemberCount = 0;
        dailyVisitorCount = 0;
        System.out.println("=== " + SHOPPING_MALL_NAME + " 시스템 시작 ===");
    }


    // setter
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    // getter
    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getEmail() {
        return email;
    }


    // 기능
    public void joinMember(){ // 회원가입 전제 회원수 +1
        totalMemberCount++;
        System.out.println(getMemberName() + "님이 회원가입 하셨습니다. (회원번호 : " + getMemberId() + ")");
    }

    public void visitSite(){ // 사이트 방문
        dailyVisitorCount++; // 일일 방문자수 증가
        System.out.println(getMemberName() + "님이 사이트를 방문했습니다.");
    }

    public void addToCart(int itemCount){ // 장바구니 추가
        // char String은 equals를 활용
        // static fonal에 관계 없이 >= > <= < == 과 같은 부등호는
        //  int         int         int 와 같이 숫자(실수, 정수)에만 가능
        if(MAX_CART_ITEMS >= cartItemCount + itemCount) {
            cartItemCount += itemCount; // 장바구니에 아이템 추가 가능
            System.out.println(getMemberName() + "님이 장바구니에 " + itemCount + "개 상품을 추가했습니다.");
        } else {
            System.out.println("장바구니 최대 수량(" + MAX_CART_ITEMS + "개)을 초과할 수 없습니다.");
        }
    }

    public void printMemberInfo(){ // 회원 정보 출력
        System.out.println("회원ID : " + memberId);
        System.out.println("회원aud : " + memberName);
        System.out.println("이메일 : " + email);
        System.out.println("장바구니 : " + cartItemCount + "개");

    }


}
