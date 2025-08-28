package edu.oop.field.pack3;

public class Korean {
    /* 필드 */

    // static이 붙은 필드는 프로그램 실행 시
    // static 메모리 영역에 할당된다.

    /* static 필드 앞에 public을 작성하는 이유
    *   -> 어디서든지 누구든지 공유할 수 있도록 하는게 목적이기 때문에
    * */
    public static int nationalCode = 82; // 국가 코드


    // static + final
    public static final String ANCESTOR = "단군 할아버지";

    private String name; // 이름
    private String id; // 주민등록번호

    // 일반 초기화 블럭
    // - 객체 생성 시 필드를 {} 내부의 값으로 초기화
    // 실행 시점 : 객체가 생성될 때 마다 실행
    // -> new Korean() 할 때 마다 실행
    // 객체마다 초기값을 공통으로 설정하고 싶을 때 사용
    // (생성자에 반복해서 쓸 필요가 없도록)
    {
        name = "홍길동";
        id = "981212-1234567";
    }
    /**
     * main 메서드에서
     * Korean k1 = new korean(); // 초기화 블럭 실행됨
     * Korean k2 = new korean(); // 또 실행됨
     */

    // static 초기화 블럭
    // -> static 붙어있는 구문은 프로그램 실행 시 1회만 읽음
    // -> Korean 객체가 100만번 생성되어도 처음 1회만 읽음
    // main 메서드가 실행될 때 최초 1회만 실행됨
    // -> Korean 클래스가 메모리에 올라갈 때 실행
    static {
        nationalCode = 10;
    }
    /**
     * main 메서드에서
     * Korean k1 = new korean(); // static에 작성된 nationalCOde는 여기서 최초 1회 실행
     * Korean k2 = new korean(); // static으로 작성된  nationalCode는 다시 실행되지 않음
     */

    /* *******************
     * 일반 초기화 블럭 : user가 접속할 때 마다 guest 부여할 때
     * k1, k2, k3와 같은 유저마다 guest 칭호를 붙이고
     * k1이 admin이면 k1만 추후 admin으로 교체
     * k2, k3는 그대로 guest 칭호를 유지
     *
     * -> 생성자 내부에 작성해놓는 경우가 더 많음
     *
     * static 초기화 블럭 : 설정 파일, 드라이버, 로깅 설정 등 프로그램 실행 시
     *                      연결해야하는 기본 설정에서 많이 사용 됨
     * *******************/

    /* 메서드 */


    public void setName(String name) {
        this.name = name;
        // 매개 변수로 전달 받은 name을
        // 현재 객체의 name 필드에 대입
    }

    public void setId(String id) {
        this.id = id;
    }

    // 반환형 void : 오직 실행 뿐 전달할 값이 없음



    // 반환형 String : 기능 실행 후 종료 시 String에 해당하는 데이터를 전달
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    /* return
    *********************************************************************
     * return; 데이터를 전달할 값이 존재하지 않고 특정 기능을
     *         return;이 작성된 순간부터 기능 중지하는 역할
     *      보통 return; 작성은 method의 최하위에 작성하는 것이 아니라
     *      if문이나 for switch while 문과 같이 특정 조건에서 다수 작성
     * *******************************************************************
     *
     * 기능이름이 종료될 때 자료형이 일치하는 변수이름이나 데이터 값을 활용할 수 있도록 전달
     * public 자료형 기능이름(매개변수 자리) {
     *      return 변수이름 or 데이터값;
     * }
     */
    /***************** int ***********************/
    public int method1() {
        // puublic 옆에 있는 자료형이 int이기 때문에 return 옆에 숫자값이 들어가야함
        return 0;
    }

    public int method2() {
        int b = 1;
        return b; // 1 대신에 1이라는 값을 담고있는 b 변수이름을 대신 활용
    }

    public int method3(int c) {
        // 나중에 매개변수 자리로 들어오는 숫자값을
        // 활용해서 추후 c로 반환
        // c에 더하기 .. 특정 기능을 추가적으로 작성한 후 반환할 수 있음
        return c;
    }
    /************** String ******************/
    public String method() {
        // public 옆에 위치한 자료형이 String 이기 때문에
        // return 값 또한 문자열 형태를 유지
        return "안녕하세요";
    }

    public String method5() {
        String d = "반값습니다";
        return d;
    }

    public String method6(String e){
        return e;
    }
}
