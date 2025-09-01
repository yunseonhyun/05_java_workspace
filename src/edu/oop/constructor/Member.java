package edu.oop.constructor;

/**
 * 오버로딩 (Over Loading : 과적 = 너무 많이 주다.)
 *
 * - 한 클래스 내에 동일한 이름의 메서드를 여러 개 작성하는 법
 *
 * - 같은 이름의 메서드가 수행하는 기능은 기본적으로 같으나
 * 전달받은 매개 변수에 따라서 조금씩 동작이 달라야 하는 경우
 * 상황별로 정의
 *
 *
 * - 오버로딩의 조건
 * 1) 메서드 이름은 똑같아야 한다.
 * 2) 매개 변수는 개수, 타입, 순서가 하나라도 달라야 한다.
 */
/*
나중에 SpringBoot라는 편리한 기능을 활용
Lombok @ 어노테이션 모양으로 코드를 간단하게 호출하여 사용하는 방법 활용할 것
@기본생성자          세터를 이용해서 데이터를 하나씩 하나씩 html에서 가져온 데이터를 담아놓는 것
@매개변수존재생성자  세터를 이용하지 않고 데이터를 한번에 html에서 가져온 데이터를 담아놓는 것
@게터                DB에 저장된 데이터를 자바에서 가져와 갖고 있는 상태
@세터                DB에 저장하기 전에 자바에서 소비자가 작성한 이름, 이메일 과 같은 데이터를 가지고 있는 상태
 */
public class Member {

    // 필드 (== 멤버 변수)
    // - 클래스 변수 : static이 붙은 변수
    //          -> static 메모리에 할당될 때 클래스명.변수명으로 으로 할당
    // 개발자가 작성한 특정 행위를 new 클래스이름()을 통해
    // 객체로 생성하고, 객체를 프로그래밍 실행하는 동안 지속적으로 사용하기 위하여
    // 객체에 특정 명칭을 붙여 활용
    // 클래스 변서의 경우 객체에 붙은 명칭을 활용하는 것이 아니라, class파일이름.
    // 을 활용하여 변수이름 사용
    // Member.변수이름;
    // public static 변수이름;
    // public static final 변수이름;

    // - 인스턴스 변수 : static이 없는 변수
    //              -> 인스턴스(객체)가 생성될 떄 heap 메모리에 할당되기 때문에
    //    Member m = new Member();  // m이라는 명칭을 활용하여 Member 클래스를  new Member() 객체로
    //    호출하여 m이라는 이름으로 객체로 불러온 문서(=사람이 작성한 코드 설계도면)
    //    를 활용

    private String memberId;    // 아이디
    private String memberName;  // 이름
    private String meberPw;     // 비밀번호
    private String mamberAge;   // 나이


    // 생성자 : 객체 생성 시 필드 초기화 + 특정 기능 수행하는
    //          일종의 메서드

    // 작성 규칙
    // 1) 반환형 없음
    // 2) 생성자 이름은 클래스이름과 동일

    /* 기본 생성자 */
    // 매개 변수가 없는 형태
    // - 생성자가 하나도 작성되지 않은 경우 자바에서 자동으로 생성
    // 개발자가 작성하지 않아도 자동으로 생성
    // 매개변수 생성자가 존재하고 기본 생성자가 존재하지 않을 경우 매개변수 생성자만 존재하고
    // 기본 생성자를 생성하지 않기 때문에 매개변수 생성자가 존재할 때는 기본생성자 또한 작성

    /* **************** 기본생성자 존재하지 않는 경우 *****************
    ***** Member class 파일 *****
    public class Member{
        private String memberId;    // 아이디
        private String memberName;  // 이름
        private String meberPw;     // 비밀번호
        private String mamberAge;   // 나이

        // 생성자가 아무것도 존재하지 않는 Member
    }

    ***** MemberRun class 파일 *****
    public class MemberRun {
    public static void main(String[] args) {

        // Member 클래스에서 생성자가 없어도
        // 자동으로 new Member() 생성자가 생성되기 때문에
        // 코딩하는데 문제가 되지 않음
        Member m  =  new Member();

        }
    }
     */



    /* **************** 기본생성자 존재하지 않는 경우 *****************
       **************** 매개변수 생성자 존재하는 경우 *****************
    ***** Member class 파일 *****
    public class Member{
        private String memberId;    // 아이디
        private String memberName;  // 이름
        private String meberPw;     // 비밀번호
        private String mamberAge;   // 나이

    매개변수 생성자만 존재하는 Member
    public Member(String memberId, String memberName, String meberPw, String mamberAge) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.meberPw = meberPw;
        this.mamberAge = mamberAge;
        }
    }

    ***** MemberRun class 파일 *****
    public class MemberRun {
    public static void main(String[] args) {

    // Member 클래스에서 Member(매개변수가 존재)하는 생성자를 개발자가 작성했기 때문에
    //Member(String memberId, String memberName, String meberPw, String mamberAge)
        Member m  =  new Member(); -> Member(){} 기본 생성자가 자동으로 생성되지 않아 에러 발생

        }
    }
     */
    /* 기본 생성자 */
    // - 매개변수가 없는 형태
    // - 생성자가 하나도 작성되지 않은 경우 자바 프로그램에서 자동 생성
    public Member() {
    }
    // ↑ 매개변수가 존재하지 않는 단순 기본 생성자가 자동으로 생성되지 않기 때문에 개발자가 작성
    // 개발자가 ↓ 매개변수가 소괄호 안에 존재하는 생성자를 만들었다면

    /* 매개 변수 생성자 */
    // - 객체 생성 시 매개 변수로 전달된 값을 생성된 객체의 필드에 초기화 되는 용도의 생성자
    // 추후 main이나 service에서 호출하여 자바 프로그램 실행 시
    // 객체 형태로 만들어질 생성자
    //              외부에서 전달받은 데이터를 갖고 있는 변수이름 변수 = 데이터가 들어있는 공간의 명칭
    public Member(String memberId, String memberName, String meberPw, String mamberAge) {
        // 현재 Member 클래스에서
        // private이나 public
        // default protected            = 외부에서 new Member(매개변수); 형태로 데이터를 가지고 온
        // 형태로 작성된 변수 이름      = 데이터가 들어있는 변수이름
        // this.변수이름                = 매개변수 명칭
        this.memberId                   = memberId;
        this.memberName                 = memberName;
        this.meberPw                    = meberPw;
        this.mamberAge                  = mamberAge;
        //                                  html에서 가져온 데이터를 담고있는 변수이름과
        // Me,ber 클래스에서 작성한
        // 변수이름과 일치하는 공간
        //                                          매개변수에서 가져온 데이터를
        // this.변수이름에 담아서 DB에 저장하겠다.
    }

    // 매개변수 타입이 다름
    // 다른건 몰라도 memberName은 무조건 갖고 있는 상태에서 나를 활용할 것!
    public Member(String memberName) {
        this.memberName = memberName;
    }
}
