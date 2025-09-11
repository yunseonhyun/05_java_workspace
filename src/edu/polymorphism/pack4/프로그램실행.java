package edu.polymorphism.pack4;

import java.util.Scanner;

public class 프로그램실행 {
    public static void main(String[] args){
        유튜브 a = new 유튜브();
        a.비디오시청("나는 자연인이다.");

        크롬 b = new 크롬();
        b.브라우저("네이버");


        System.out.print("이메일 입력 : ");
        String email = "user@email.com";
        구글서비스 c = new 유튜브();
        c.login(email);
        c.logout(email);

        구글서비스 d = new 크롬();
        d.login(email);
        d.logout(email);
    }
}
