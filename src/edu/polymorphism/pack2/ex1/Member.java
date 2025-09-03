package edu.polymorphism.pack2.ex1;
/*
부모 클래스에 해당
일반회원, VIP 회원
필수로 Member 클래스를 상속받는 자식 클래스는 각 회원 타입에서 할인율을 다르게 구현
로그인 로그아웃은 자식 클래스에서 굳이 추가적으로 구현하지 않아도 됨
 */
public class Member {
    // 필드 인스턴스변수 속성
    protected String memberId;
    protected String memberName;
    protected String memberEmail;
    // 기능들() 붙으면 메서드 ~ ~ !
    // 디폴트(기본)생성자 메서드
    public Member() {
    }

    // 파라미터(매개변수)생성자 메서드
    public Member(String memberId, String memberName, String memberEmail) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberEmail = memberEmail;
    }

    // 게터 세터
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    // 수정이 필요없는 공통 실행 기능 메서드 - 모든 회원이 동일하게 재활용없이 사용할 기능
    public void login(){
        System.out.println(getMemberName() + "님이 로그인 했습니다.");
    }

    public void logout(){
        System.out.println(getMemberName() + "님이 로그아웃 했습니다.");
    }
    // 비추상 클래스에 추상 메서드가 있습니다 -> public과 class 사이에 abstract
    // 필수로 자식클래스에서 작성해야한다는 표기가 존재하지 않는데
    // 저(abstract)를 쓴다합니다.
    public abstract double 할인율();
}
