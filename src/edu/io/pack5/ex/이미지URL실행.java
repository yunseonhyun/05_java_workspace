package edu.io.pack5.ex;

import java.util.Scanner;

public class 이미지URL실행 {
    public static void main(String[] args) {
        이미지URL서비스 s = new 이미지URL서비스();
        Scanner sc = new Scanner(System.in);

        System.out.print("이미지 주소를 작성하세요 : ");
        String imgUrl = sc.nextLine();
        System.out.print("이미지 저장할 폴더이름을 작성하세요");
        String imgDir = sc.nextLine();
        System.out.print("이미지의 명칭을 작성하세요 : ");
        String name = sc.nextLine();
        // 사용자에게 1, 2, 3 중 선택하여 확장자 명칭 추가
        String imgName = name + ".png";
        s.dirSaveImg(imgUrl, imgDir, imgName);
    }
}
