package edu.oop.basic;

/**
 * Nation 클래스를 활용한 객체 생성 및 조작 실습
 */
public class NationRun {

    public static void main(String[] args) {
        Nation n1 =  new Nation();

        /*
        public String name;        // 이름
        public int age;            // 나이
        public char gender;        // 성별
        public String juminNumber; // 주민등록번호
        public String tel;         // 전화번호
        public String address;     // 주소

        자료형 앞에 private가 아닌 public으로 작성했을 경우 아래와 같은 구문 수행 가능
        은행 예시로 들었을 때 창고에 직접 들어가서 돈을 저장
        n1.name = "홍길동";
        n1.age = 25;
        n1.gender = '남';
        */

        // n1.setName = "홍길동"; // setName(String name)의 형태가 매개변수로 값을 저장하는 형태
        n1.setName("홍길동");
        n1.setAge(25);
        n1.setGender('남');
        n1.setTel("010-1234-5678");
        n1.setAddress("서울시 강남구");
        // System.out.printf("이름은 %s이고, %d세 %c성 입니다.\n", n1.getName(), n1.getAge(), n1.getGender());


        // ===== 문제 2 : 필수생성자 활용 =====
        // 이름 : 이영희, 나이: 17, 성별: '여', 주민등록번호: "070312-4567890"
        // 전화번호: "010-9876-5432", 주소: "부산시 해운대구"
        Nation n2 =  new Nation("이영희", 17, '여',
                "070312-456790", "010-9876-5432", "부산시 해운대구");


        // ===== 문제 3: 필수생성자 활용 =====
        // 필수 생성자로 국민 객체 n3을 생성한 후, setter를 사용하여 다음 정보를 설정하세요.
        // 이름: "박민수", 나이: 42, 성별: '남', 주민등록번호: "820525-1987654"
        // 전화번호: "010-5555-7777", 주소: "대구시 중구"
        Nation n3 =  new Nation("박민수", 42, '남',
                "820525-1987654", "010-5555-7777", "대구시 중구");

        // ===== 자기소개 활용해서 모든 국민들의 자기소개 확인
        n1.introduce();
        n2.introduce();
        n3.introduce();
        // ===== 납세의 의무 확인하여 결과 출력
        n1.납세의의무();
        n2.납세의의무();
        n3.납세의의무();

        // ===== 한국어 능력 및 복지 혜택 확인
        // 1. n1 국민부터 n3 국민까지 각각 한국어 능력 및 복지혜택 확인
        n1.speakKorean();
        n1.welfare();
        n2.speakKorean();
        n2.welfare();
        n3.speakKorean();
        n3.welfare();
    }
}
