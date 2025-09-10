package edu.io.pack5.run;

import edu.io.pack5.service.프로필사진service;

import java.io.IOException;

public class 프로필사진run {
    public static void main(String[] args) {
        프로필사진service service = new 프로필사진service();

        // service.createProfileFolder("member03", "프로필사진2.png");
        // service.createProfileFolder("member04", "프로필사진2.png");

        String imgurl = "https://flexible.img.hani.co.kr/flexible/normal/960/960/imgdb/resize/2019/0121/00501111_20190121.webp";
        // service.saveImg(imgurl);


        // 인터넷에서 이미지 주소를 복사한 후
        // 원하는 이미지를
        String imgUrl2 = "이미지 주소 넣어주기";
        service.saveImg2(imgUrl2);

    }
}
