package edu.polymorphism.pack4;

public class 유튜브 extends 구글서비스 {

    // 생성자 - 부모의 필드이름을 사용하는 생성자
    public 유튜브(){
        super("유튜브");
    }

    public void 비디오시청(String 비디오제목){
        System.out.println(비디오제목 + " 영상을 시청합니다.");
    }
}
