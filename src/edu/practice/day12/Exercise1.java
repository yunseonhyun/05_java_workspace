package edu.practice.day12;

import java.io.IOException;
import java.nio.file.*; // 파일 문서 내 모든 클래스 사용 처리

public class Exercise1 {

    public void method1(String dirName, String fileName) {
        Path folderPath = Path.of(dirName);
        Path filePath = Path.of(dirName, fileName);
        String content = "안녕하세요 자바 파일 처리 연습중입니다.";

        try {
            Files.createDirectories(folderPath);
            Files.writeString(filePath,content);
            System.out.println("hello.txt 파일 생성 완료");
        } catch (IOException e) {
            System.out.println("오류 발생");
        }


    }


    public void method2(String dirName, String fileName) {
        Path filePath = Path.of(dirName, fileName);
        String content; // 읽어온 내용

        if(Files.exists(filePath)){
            try {
                content = Files.readString(filePath);
                System.out.println("파일 내용 : " + content);
            } catch (IOException e) {
                System.out.println("오류 발생");
            }
        } else {
            System.out.println("파일을 찾을 수 없습니다.");
            return;
        }
    }


    public void method3(String dirName, String fileName){
        Path filePath = Path.of(dirName, fileName);
        String content = "오늘의 메뉴\n1. 김치찌개\n2. 불고기\n3. 비빔밥";
        try {
            Files.createFile(filePath);
            Files.writeString(filePath,content);
            System.out.println("menu.txt 파일 생성 완료!");
        } catch (IOException e) {
            System.out.println("파일 생성 중 오류 발생");
            System.out.println("회사에서 지시내린 규칙대로");
            System.out.println("개발자는 추후 필요한 조치를 취해야함");
        }
    }


    public void method4(){
        Path filePath = Path.of("practice", "temp.txt");
        String content = "임시파일입니다";
        boolean exists = Files.exists(filePath); // 존재 여부

        try {
            Files.createFile(filePath);
            Files.writeString(filePath, content);
            System.out.println("내용 작성 완료");
        } catch (IOException e) {
            System.out.println("오류 발생");
        }


        if(exists){
            System.out.println("temp.txt 파일이 존재합니다");
            try {
                Files.delete(filePath);
                System.out.println("temp.txt 파일 삭제 완료");
            } catch (IOException e) {
                System.out.println("오류 발생");
            }
        }

        System.out.println("파일 삭제 확인 : " + exists);
    }


    public void method5(String 폴더1번, String 폴더2번, String 폴더3번){
        Path dirPath = Path.of(폴더1번, 폴더2번, 폴더3번);
        Path note1Path = Path.of(폴더1번, 폴더2번, 폴더3번, "note1.txt");
        Path note2Path = Path.of(폴더1번, 폴더2번, 폴더3번, "note2.txt");
        String note1Content = "자바 기초 공부중";
        String note2Content = "파일 처리 배우는 중";

        try {
            Files.createDirectories(dirPath);
            System.out.println("모든 폴더 생성 완료");
            Files.createFile(note1Path);
            Files.createFile(note2Path);
            System.out.println("모든 파일 생성 완료");
            Files.writeString(note1Path, note1Content);
            Files.writeString(note2Path, note2Content);
            String content1 = Files.readString(note1Path);
            String content2 = Files.readString(note2Path);
            System.out.println("note1.txt 내용 : " +  content1);
            System.out.println("note2.txt 내용 : " +  content2);
        } catch (IOException e) {
            System.out.println("오류 발생");
        }


    }
}
