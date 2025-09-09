package edu.io.pack3.ex;

import java.util.Scanner;

public class FilePracticeRun {
    public static void main(String[] args) {
        FilePracticeService fps = new FilePracticeService();
        String dirName;

        Scanner sc = new Scanner(System.in);
        System.out.print("폴더를 입력하시겠습니까? (yes/no) : ");
        //              글자입력받고 공백없음 모두소문자처리
        String answer = sc.nextLine().trim().toLowerCase();
        // 없으면 기본프로젝트 최상위 폴더 설정
        // yes 이면 폴더 입력 후
        // dirName으로 입력한 폴더이름 method1 전달
        if(answer.equals("yes")){
            System.out.print("폴더 이름을 입력해주세요 : ");
            dirName = sc.nextLine().trim();

        } else {
            dirName = "";
            System.out.println("기본 프로젝트 최상위 폴더로 설정됩니다.");
        }
        System.out.print("내용을 확인할 파일이름 + 확장자를 입력하세요 : ");
        String fileName = sc.nextLine();
        fps.method1(dirName, fileName);
    }
}
