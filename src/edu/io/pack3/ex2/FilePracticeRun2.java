package edu.io.pack3.ex2;

import java.util.Scanner;

public class FilePracticeRun2 {
    public static void main(String[] args) {
        FilePracticeService2 fps = new FilePracticeService2();
        String dirName;

        Scanner sc = new Scanner(System.in);
        System.out.print("폴더를 입력하시겠습니까? (yes/no) : ");
        String answer = sc.nextLine().trim().toLowerCase();
        if(answer.equals("yes")){
            System.out.print("폴더 이름을 입력해주세요 : ");
            dirName = sc.nextLine().trim();

        } else {
            dirName = "";
            System.out.println("기본 프로젝트 최상위 폴더로 설정됩니다.");
        }
        System.out.print("내용을 확인할 파일이름 + 확장자를 입력하세요 : ");
        String fileName = sc.nextLine();
        int dotIndex = fileName.lastIndexOf(".");
        if(dotIndex == -1 || dotIndex == fileName.length() -1){
            System.out.println("프로그램을 종료합니다");
            return;
        }
        fps.method1(dirName, fileName);

        // fileName 뒤에 확장자를 작성하지 않았을 경우 확장자가 없다 프로그램을 종료합니다.

    }
}
