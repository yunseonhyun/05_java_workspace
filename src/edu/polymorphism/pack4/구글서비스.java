package edu.polymorphism.pack4;

public class 구글서비스 {


    protected String 서비스이름;
    protected boolean 로그인유무;


    public 구글서비스(String 서비스이름) {
        this.서비스이름 = 서비스이름;
    }

    public void login(String email){
        로그인유무 = true;
        System.out.println(email + "로 " + 서비스이름 + "에 로그인 했습니다");
    }

    public void logout(String email){
        로그인유무 = false;
        System.out.println(서비스이름 + "에 로그아웃롬 했습니다");
    }
}
