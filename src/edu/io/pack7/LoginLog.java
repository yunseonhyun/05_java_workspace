package edu.io.pack7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
로그인 로그아웃을 기록하기
Windows C://더조은회사로그파일/
 */
public class LoginLog {

    public void login(){
        Path path = Path.of("C:", "더조은회사", "login.log");

        try {
            Files.createDirectories(path.getParent());
            System.out.println("로그인 기록 파일이 생성되었습니다.");

            String logoutInfo = 현재시간가져오기() + "\n유저가 로그인한 정보";
            // Files.writeString(path, "\n유저가 로그인한 정보"); // StandardOpenOption이 아무것도 없을 때는 기본값 : CREATE
            // Files.writeString(path, "\n유저가 로그인한 정보", StandardOpenOption.CREATE); // 무조건 파일 다시 만들기
            // Files.writeString(path, "\n유저가 로그인한 정보", StandardOpenOption.APPEND); // 무조건 파일 내 내용 이어서 작성하기
            Files.writeString(path, logoutInfo, StandardOpenOption.CREATE,StandardOpenOption.APPEND); // 파일이 없으면 생성하고, 이어서 작성하기
            System.out.println("유저가 로그인한 정보를 작성 완료했습니다. -- 개발자가 단순코드 동작확인용출력문");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void logout(){
        Path path = Path.of("C:", "더조은회사", "login.log");

        try {
            Files.createDirectories(path.getParent());


            System.out.println("유저가 로그아웃한 정보를 작성 완료했습니다. -- 개발자가 단순코드 동작확인용출력문");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 로그인하고, 로그아웃한 시간 기록하기
    public String 현재시간가져오기(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
