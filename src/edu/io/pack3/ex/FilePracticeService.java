package edu.io.pack3.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilePracticeService {

    // Path
    // Files

    // 를 이용해서 1. my_logs라는 폴더가 존재하는지 확인하고
    // 내부에 intro.txt 파일이 존재하는지 확인
    // 폴더 / 파일 모두 존재하면
    // 현대방식의 파일읽기 방식을 활용해서 intro.txt 내부에 작성된 글자를 모두 읽고 읽은 내용 출력
    public void method1(String fileName){
        Path path = Path.of("my_logs", fileName);

        if(!Files.exists(path)){
            System.out.println("파일이 존재하지 않습니다.");
        }

        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("오류가 발생했습니다.");
        }
    }

}
