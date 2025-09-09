package edu.io.pack4.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class 파일생성삭제서비스{

    // createFolder

    // createFile

    // 각 메서드 생성 후
    // createFodler 를 이용해서 file/store 이라는 폴더 생성

    // createFile 에서는

    // file/store 폴더가 존재하는지 확인하고

    // 존재하면 Book.txt 파일 생성

    // 더조은책방 - 책 리스트 한 줄 추가 후
    // 생성 완료까지 확인

    public void method1(){
        Scanner sc = new Scanner(System.in);
        Path path = Path.of("file", "store", "Book.txt");
        if(!Files.exists(path.getParent())){
            try {
                Files.createDirectories(path.getParent());
                System.out.println("폴더생성이 완료되었습니다");
            } catch (IOException e) {
                System.out.println("오류 발생");
            }
        }

        if(Files.exists(path.getParent())){
            try {
                Files.createFile(path);
                System.out.println("파일이 생성되었습니다.");
            } catch (IOException e) {
                System.out.println("오류 발생");
            }
        }



        // 텍스트 작성
        System.out.println("종료를 입력하면 파일 작성이 종료됩니다.");
        System.out.print("파일에 쓸 내용을 입력하세요 : ");
        StringBuilder content = new StringBuilder();
        String line;

        while(!(line = sc.nextLine()).equals("종료")) {
            content.append(line).append("\n");
        }

        try {
            Files.writeString(path, content.toString());
        } catch (IOException e) {
            System.out.println("파일 생성 중 오류 발생");
        }


    }
}

