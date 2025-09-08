package practice.exception.ex;

import java.util.Scanner;

public class ExceptionService {
    public void method1(){
        int a = 10;
        int b = 0;

        try { // 문제가 발생할 수 있는 코드 구문 시작과 종료를 작성
            System.out.println("a / b : " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("0으로 숫자를 나눌 수 없습니다.");
            // 이러한 돌발행동을 진행했을 때
            // 개발자는 프로젝트 취지에 맞도록 클라이언트의 행동을 유도
        } catch(Exception e) {
            System.out.println("개발자가 생각치 못한 문제가 발생했습니다.");
        }
    }


    public void method2(){
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("현재 목록은 " + arr.length + "개 존재합니다.");
            System.out.println("확인하고자 하는 목록의 번호를 다시 입력하세요.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }


    public void method3(){

        String file = "파일이름.txt";
        // 파일이름 확인 확장자명 확인
        // 확장자표기인 .이 존재하지 않으면 예외 발생

        int dotIndex = file.lastIndexOf('.'); // .이 파일명에서 어디 있는가 찾기
        try {
            String 파일이름 = file.substring(0, dotIndex);
            String 확장자이름 = file.substring(dotIndex);

            System.out.println("파일 이름 확인 : " + 파일이름);
            System.out.println("확장자명 확인 : " + 확장자이름);
            System.out.println("파일이름과 확장자명 확인 검사를 성공했습니다.");
        } catch (StringIndexOutOfBoundsException e) {
            // 파일이름txt에서 .이 존재하지 않아 dotIndex가 -1로
            // . index 번호를 찾을 수 없음을 표기
            System.out.println("file 이름 내 .이 존재하지 않습니다. 확장자를 다시 작성해주세요.");
        }


    }


    public void method4(){

        Scanner sc = new Scanner(System.in);
        System.out.print("파일이름 : ");
        String file = sc.nextLine();
        // 파일이름 확인 확장자명 확인
        // 확장자표기인 .이 존재하지 않으면 예외 발생

        int dotIndex = file.lastIndexOf('.'); // .이 파일명에서 어디 있는가 찾기
        System.out.println("dotIndex 위치 : " + dotIndex);
        try {
            // dorIndex에서 .뒤에 아무런 확장자 명칭이 존재하지 않으면
            // throw new IllegalArgumentException("존재하는 확장자 명칭이 없습니다.")
            // 를 if문 / catch 문을 활용해서 출력할 수 있도록 설정


            String 파일이름 = file.substring(0, dotIndex);
            String 확장자이름 = file.substring(dotIndex);

            if(확장자이름.length() == 1){
                throw new IllegalArgumentException();
            } else {
                System.out.println("파일 이름 확인 : " + 파일이름);
                System.out.println("확장자명 확인 : " + 확장자이름);
                System.out.println("파일이름과 확장자명 확인 검사를 성공했습니다.");
            }
        } catch (StringIndexOutOfBoundsException e) {
            // 파일이름txt에서 .이 존재하지 않아 dotIndex가 -1로
            // . index 번호를 찾을 수 없음을 표기
            System.out.println("file 이름 내 .이 존재하지 않습니다. 확장자를 다시 작성해주세요.");
        } catch (IllegalArgumentException e) {
            System.out.println("확장자명이 없습니다.");
        } catch (Exception e) {
            System.out.println("개발자가 생각치 못한 오류 기록 후 추후 catch문 추가하기");
        } finally {
            sc.close(); // 스캐너를 닫거나, 프로그램 종료 처리
        }


    }


    public void method5(){
        String DBID = "user1";
        String DBPW = "pass1";

        Scanner sc = new Scanner(System.in);

        System.out.print("아이디를 입력하세요 : ");
        String 사용자입력Id = sc.nextLine();
        System.out.print("비밀번호를 입력하세요 : ");
        String 사용자입력Pw = sc.nextLine();

        try {
            if(!DBID.equals(사용자입력Id)){
                throw new UserNotFoundException();

                // System.out.print는 개발자가 문제되는 코드의 로직에 대한 결과를
                // 확인하거나 log와 같은 txt파일에 소비자가 로그인 하는 순간부터
                // 로그아웃 되는 순간까지 시시각각 기록하는 파일
                // DB에 저장되어 있는 id와 소비자가 html에서 작성한 id가 일치하는지 확인하고
                // DB에 저장되어 있는 아이디가 없으면
                // 예외문제가 발생하는 상황에서 존재하지 않는 아이디입니다.
                // 와 같은 경고와 함께 진행하고 있던 기능을 정지
                // -> throw new 또는 exception의 역할
                // System.out.println("사용자 입력 아이디가 일치하지 않습니다.");
            }

            if(!DBPW.equals(사용자입력Pw)){
               throw new InvalidPasswordException();
            }

            System.out.println(사용자입력Id + "님이 로그인이 완료되었습니다.");
        } catch (UserNotFoundException e) {
            // 이 경우 회사 기획부서에서 전달받은 내용 대로 추가 로직 작성하기
            // 아이디를 찾을 수 없을 때 휴먼계정으로 전환되니 것은 아닌지
            // 와 같은 세부 로직 작성
        } catch (InvalidPasswordException e) {
            // 이 경우 회사 기획부서에서 전달받은 내용 대로 추가 로직 작성하기
            // 비밀번호를 5회 잘못입력 했을 경우 아이디 비밀번호
            // 고객센터 전화 후 회사에서 직접적으로 풀어주는 lock 설정 한다던지
            // 휴먼계정 처리하기
        } catch (Exception e) {
            System.out.println("개발자가 모르는 문제 발생");
            // File 클래스를 이용해서 log.log와 같은 log 확장자 파일을 생성후
            // 문제가 생긴 데이터를 모두 .log라는 파일 안에 작성하여
            // 개발부터에서 내부적으로 문제를 해결할 수 있도록 진행
        }
    }


}
