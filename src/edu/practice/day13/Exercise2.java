package edu.practice.day13;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Exercise2 {

    public void solution1(){
        Path studentDir = Path.of("student");
        Path filePath = studentDir.resolve("info.txt");
        String content = "이름 : 홍길동\n나이 : 25\n전공 : 컴퓨터공학\n학년 : 3학년\n";
        try {
            Files.createDirectories(studentDir);
            Files.writeString(filePath, content);
            System.out.println("학생 정보 파일이 생성되었습니다.");
            System.out.println("=== 파일 내용 ===");
            String read = Files.readString(filePath);
            System.out.println(read);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void solution2(){
        Path textDir = Path.of("downloads", "text","downloaded_data.txt");
        String textUrl = "https://httpbin.org/base64/SGVsbG8gV29ybGQhIEphdmEgRmlsZSBJTyBQcmFjdGljZQ==";


        try {
            Files.createDirectories(textDir.getParent());
            URL url = new URL(textUrl);
            InputStream is = url.openStream();
            Files.copy(is, textDir);
            System.out.println("텍스트 다운로드 완료 : " + textDir);
            String content = Files.readString(textDir);
            System.out.println("다운로드된 내용 : " + content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void solution3(){
        Path backupDir = Path.of("backup");
        String fileName = "document.txt";
        Path filePath = Path.of(backupDir + fileName);
        String baseName = "document";
        String extension = ".txt";
        String content = "이것은 백업 문서입니다.";
        int counter = 1;



            while(Files.exists(filePath)){

                String newName = baseName + "_" + counter + extension;
                counter++;

                filePath = backupDir.resolve(newName);


            }

        try {
            Files.createDirectories(backupDir);
            Files.writeString(filePath, content);
            System.out.println("파일이 저장되었습니다 : " + filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void solution4(){
        Path tempDir = Path.of("temp");
        Path archiveDir = Path.of("archive");
        Path backupDir = Path.of("backup");
        Path sourceFile = tempDir.resolve("data.txt");
        Path targetFile = archiveDir.resolve("data.txt");
        Path backupFile = backupDir.resolve("data_backup.txt");
        String content = "중요한 데이터 파일";
        try {
            Files.createDirectories(tempDir);
            Files.writeString(sourceFile, content);
            System.out.println("1단계 : 임시 파일 생성 완료 - " + sourceFile);

            Files.createDirectories(archiveDir);
            Files.createDirectories(backupDir);
            System.out.println("2단계 : 폴더 생성 완료 - archive, backup");

            Files.move(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("3단계 : 파일이동 완료 - " + sourceFile + "->" + targetFile);

            Files.copy(targetFile, backupFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("4단계 : 백업 복사 완료 - " + backupFile);
        } catch (IOException e) {
            System.out.println("오류 발생");
        }
    }

    public void solution5(){
        Scanner sc = new Scanner(System.in);

        Path logsDir = Path.of("logs");
        Scanner scanner = new Scanner(System.in);
        StringBuilder content = new StringBuilder();
        long timestamp = System.currentTimeMillis();
        String fileName = "log_" + timestamp + ".txt";
        int logCount = 0;
        String input = "";

        try {
            Files.createDirectories(logsDir);
            System.out.println("=== 로그 생성기 시작 ===");
            System.out.println("로그 메시지를 입력하세요 ('종료'를 입력하면 저장됩니다.)");
            while(input.contains("종료")){
                input = sc.nextLine();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void solution6(){}
}
