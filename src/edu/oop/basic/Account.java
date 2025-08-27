package edu.oop.basic;
// basic.Account

/*
* 계좌 클래스
* 추후 DB와 JAVA를 연결할 변수 명칭을 작성하는 클래스
* */
public class Account {
    // [ 캡슐화 ]
    // - 객체의 속성(필드) 직접 접근을 제한하는 것이 원칙
    // (private : 현재 객체만 접근 가능한, 사적인, 개인적인)

    // - 속성에 직접 접근을 할 수 없으므로
    // 대신 간접 접근을 할 수 있는 기능을 작성해야 함

    // 속성(값) - DB 컬럼명칭과 맞추어 상호작용하여 데이터를 주고 받을 명칭
    private String name;            // 이름(예금주)
    private String accountNumber;   // 계좌 번호
    private long balance;           // 잔액
    private String password;        // 비밀번호

    // 단축키 Alt + Insert 를 클릭하면 생성자 getter setter를 만들어주는 기능 실행
    // 메서드(기능) - 생성자
    //              생성자 - 기본
    //              생성자 - 필수

    // 메서드(기능) - 기본생성자
    // c 형태로 되어있는 edu.oop.basic.Account를 선택해서 생성
    public Account() {
    }

    // 메서드(기능) - 필수생성자
    // c 형태 아래에 존재하는 f 형태에서 필요한 속성 명칭을 선택해서 생성

    public Account(String name, String accountNumber, long balance, String password) {
        this.password = password;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.name = name;
    }
    // 메서드(기능) - setter : html에서 사용자에게 전달받은 값을 자바의 변수이름 내부에 저장하는 역할

    /**
     * setter 주의할 점    아래와 같은 코드 금지
     *
     * if(계좌잔액 < 0) {
     *     // 잔액은 음수가 될 수 없습니다.
     *     return; // 계좌 잔액에 일치하지 않는 데이터를 돌려보내기
     * }
     *
     * setter 내부에서 if 문이나 조건을 통해 데이터를 저장하는 형태를 작성하는 것은 지양
     */

    /*
        private String name;

        public void setname(String html에서 데이터 전달 받아올 이름) {
            this.name = html에서 테이터 전달받아올 변수이름;
        }

        setName은 private String name 변수명칭에 데이터를 저장하기 위한 메서드
        this.name = 위에서 작성한 private String name 가리킴

        this.name = name에서 name은 String name에서 가져온 변수명칭을 가리킴

        (String name) 매개변수 내부에 존재하는 변수이름은 private에서 작성한 변수이름과 다르게 작성해도
        상관없지만, private으로 작성한 속성명칭이 많아지면 변수이름들을 관리하는데 문제가 발생할 수 있기 때문에
        속성명칭과 매개변수 내부에 작성한 변수명칭을 동일하게 작성해주는 것이 바람직함

        public void setName(String name) {
            this.name = name;
        }
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    // 메서드(기능) - getter : DB나 이메일 인증키와 같은 데이터를 사용자에게 전달하는 역할

    /**
     *
     *
     *
     * @return : 메서드 내부에서 작성한 특정 데이터나 setter로 저장되어 있거나,
     *              리터럴 형태로 변수이름에 직접적으로 작성된 데이터를 전달할 때 사용하는 메서드
     *              return에서 작성되어 있는 변수명칭의 자료형은 public 옆에 존재하는 위치에 작성
     *
     *              public 리턴할변수이름의자료형 get변수이름() {
     *                  return 데이터를전달항변수이름;
     *              }
     */
    public String getPassword() {
        return password;
    }

    public long getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    // 생성자 기본, 필수, getter setter 이외 개발자가 필요로 하는 메서드 기능 작성

    /**
     * 비밀번호와 출금할 금액을 전달 받아와
     * 조건에 맞으면 잔액에서 차감 후 현재 잔액을 출력
     *
     * 조건 1) 비밀번호가 일치하지 않으면 "비밀번호 불일치" 출력
     * 조건 2) 출금할 금액이 잔액보다 크면 "잔액 부족" 출력
     *
     * @param pw        : 클라인언트가 작성한 비밀번호를 가지고 있는 매개변수 이름
     * @param amount    : 클라이언트가 출금 요청한 숫자의 데이터를 가지고 있는 출금할 금액의 매개변수이름
     */
    public void withdraw(String pw, long amount) {
        // 자바에서
        // - 기본 자료형 비교는 ==
        // - 객체(참조형) 비교 A.equlas(B)  대표적인 예) String 문자열과 비교할 경우 equals 사용

        // 현재 계좌 비밀번호(password)와
        // 전달 받은 비밀번호(pw)가 같은 경우 tru/ 다르면 false
        if(!password.equals(pw)) {// 다를 경우
            System.out.println("비밀번호 불일치");
            return; // 기능 종료 후 이래 코드는 더이상 수행하지 못하고 호출한 곳으로 돌아감
            // withdraw 다음에 작성되어 있는 메서드 기능 수행하거나 기능이 없으면 종료
        }

        // 출금할 금액이 잔액보다 큰 경우
        if(amount > balance) {
            System.out.println("잔액이 부족합니다.");
            return; // 출금 못하도록 돌려보내기
        }

        // 보유 잔액에서 출금할 금액만큼 차감
        this.balance -= amount;

        System.out.printf("%s 게좌에서 %d원 출금 \n : ", accountNumber, amount);
        System.out.println(name + " 의 현재 잔액 : " + balance);
    }
}
