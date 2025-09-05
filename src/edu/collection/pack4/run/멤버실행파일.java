package edu.collection.pack4.run;


import edu.collection.pack4.model.멤버;
import edu.collection.pack4.service.멤버기능서비스;

import java.util.Scanner;

public class 멤버실행파일 {

    public static void main(String[] args) {

        // 멤버 기능 서비스와
        // 다양한 모델을 활용해서 프로그램 실행



        Scanner sc = new Scanner(System.in); // html 화면 대신 사용
        new 멤버() ;
        멤버기능서비스 service = new 멤버기능서비스();
        new 멤버().set멤버이름("홍길동");
        new 멤버().set멤버이름("강말숙"); // 공간을 생성하고 공간안에 홍길동이나 강말숙 설정
        // 이 각각의 데이터를 어디서 어떻게 개발자가 갖고오는가?
        // 하여 사람이 알 수 있는 주소명칭을 붙여주는 것
        // 공간의주소명칭을 변수이름으로 설정
        // 공간마다 이름, 핸드폰번호, 이메일 과 같은 데이터를 각 고객에 맞게 공간에서 갖고 있는상태


        System.out.println("우리와 함께 다같이 [멤버] 가 되자!");
        System.out.println("=".repeat(10) + "[ 멤 버 회 사]" +"=".repeat(10) );
        // html 에서 사용자가 키보드로 작성한 유저데이터
        System.out.println("회원가입을 진행합니다.");
        System.out.print("성함을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("핸드폰 번호를 입력하세요 : ");
        String phoneNumber = sc.nextLine();
        System.out.print("이메일을 입력하세요 : ");
        String email = sc.nextLine();

        멤버 m2 = new 멤버(name,phoneNumber,email);

        service.멤버조회(name,phoneNumber,email);

    }
}