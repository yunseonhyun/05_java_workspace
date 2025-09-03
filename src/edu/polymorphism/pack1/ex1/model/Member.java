package edu.polymorphism.pack1.ex1.model;

public class Member {
    // 회원 정보 관련 필드들
    private String memberName;
    private String memberId;
    private String memberEmail;
    private String memberPhone;
    private String memberAddress;
    private int memberAge;
    private String memberGrade; // 일반, VIP, VVIP
    private double memberPoint;



    // 기본생성자
    public Member() {
    }
    // new Member("김철수", "kim123", "kim@email.com",
    //            "010-1234-5678", "서울시 강남구", 30, "VIP", 1500.0);

    // 매개변수 생성자
    public Member(String memberName, String memberId, String memberEmail, String memberPhone, String memberAddress, int memberAge, String memberGrade, double memberPoint) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.memberEmail = memberEmail;
        this.memberPhone = memberPhone;
        this.memberAddress = memberAddress;
        this.memberAge = memberAge;
        this.memberGrade = memberGrade;
        this.memberPoint = memberPoint;
    }

    // Object 클래스 내에 존재하는 필드 정보 조회 메서드를 호출하고
    // MemberService에서 정보 조회 메서드를 사용하여 정보 조회하기
    // @Override

    // 게터 세터
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    public String getMemberGrade() {
        return memberGrade;
    }

    public void setMemberGrade(String memberGrade) {
        this.memberGrade = memberGrade;
    }

    public double getMemberPoint() {
        return memberPoint;
    }

    public void setMemberPoint(double memberPoint) {
        this.memberPoint = memberPoint;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberName='" + memberName + '\'' +
                ", memberId='" + memberId + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberPhone='" + memberPhone + '\'' +
                ", memberAddress='" + memberAddress + '\'' +
                ", memberAge=" + memberAge +
                ", memberGrade='" + memberGrade + '\'' +
                ", memberPoint=" + memberPoint +
                '}';
    }

    // 회원 관련 메서드들
    public void memberLogin() {
        System.out.println(memberName + "님이 로그인했습니다.");
    }

    public void memberLogout() {
        System.out.println(memberName + "님이 로그아웃했습니다.");
    }

    public void addMemberPoint(double point) {
        this.memberPoint += point;
        System.out.println("포인트가 " + point + "점 적립되었습니다. 현재 포인트: " + this.memberPoint);
    }

    public void useMemberPoint(double point) {
        if (this.memberPoint >= point) {
            this.memberPoint -= point;
            System.out.println("포인트 " + point + "점을 사용했습니다. 남은 포인트: " + this.memberPoint);
        } else {
            System.out.println("포인트가 부족합니다.");
        }
    }

    public void upgradeMemberGrade() {
        if (memberGrade.equals("일반")) {
            memberGrade = "VIP";
        } else if (memberGrade.equals("VIP")) {
            memberGrade = "VVIP";
        }
        System.out.println("회원등급이 " + memberGrade + "로 승급되었습니다.");
    }
}
