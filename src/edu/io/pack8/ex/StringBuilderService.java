package edu.io.pack8.ex;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringBuilderService {

    public void saveBooks(){
        Path bookDir = Path.of("books");
        Path bookFile = Path.of("books", "book_list.txt");
        StringBuilder bookData = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        try {
            Files.createDirectories(bookDir);
            System.out.println("도서 정보를 입력하세요 (완료를 입력하면 저장됩니다)");
            while(true) {
                System.out.print("제목 : ");
                String title = scanner.nextLine();

                if(title.equals("완료")){
                    break;
                }
                System.out.print("저자 : ");
                String author = scanner.nextLine();
                System.out.print("출판년도 : ");
                String year = scanner.nextLine();

                bookData.append("제목 : "+ title +" , 저자 : "+author +", 출판년도 : "+year +"\n");
                System.out.println("입력 완료");
            }
            Files.writeString(bookFile,bookData.toString());
            //while 로 데이터를 추가하는 동안은
            // 파일 아래에 지속적으로 추가되지만,
            // saveBooks 을 다시 실행하면 초기화 된 상태로 데이터가 다시 저장됨
            // 이어쓰기인지 매번 새로운 파일을 만드는지 파일을 만드는 목표를 확인하고, 옵션 설정
            System.out.println("도서목록이 저장되었습니다. : " + bookFile.getFileName());
            System.out.println("저장된 내용");
            System.out.println(Files.readString(bookFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Files.createDirectories();
        //Files.writeString(), Files.readString()
    }

    public void manageGrades(){
        String today = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Path gradeDir = Path.of("grades");
        Path gradeFile = Path.of("grades", today + "_성적표.txt");
        StringBuilder gradeData = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        // 1. 폴더 확인 생성
        try {
            Files.createDirectories(gradeDir);
            System.out.println(gradeDir + "폴더 생성되었습니다.");
            System.out.println("학생 성적을 입력하세요. (종료를 입력하면 저장됩니다.)");
            while(true) {
                System.out.print("이름 : ");
                String name = scanner.nextLine();

                if(name.equals("종료")){
                    break;
                }

                System.out.print("국어 : ");
                int kor =  scanner.nextInt();
                scanner.nextLine();
                System.out.print("영어 : ");
                int eng =  scanner.nextInt();
                scanner.nextLine();
                System.out.print("수학 : ");
                int math =  scanner.nextInt();
                scanner.nextLine();

                double avg = (kor+eng+math);

                gradeData.append("이름 : " + name + ", 국어 : " + kor + ", 수학" + math + ", 영어" + eng + ", 평균 : " + avg + "\n");
                System.out.println("입력 완료되었습니다.");
            }

            // 모든 입력이 되어, 종료를 작성했다면
            Files.writeString(gradeFile,gradeData.toString());
            System.out.println("오늘 성적표가 작성되었습니다 : " + gradeFile.getFileName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void recordCount(){
        Path householdDir = Path.of("household");
        Path accountFile = Path.of("household", "account_book.txt");
        String timestamp = getCurrentTime();
        StringBuilder accountData = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("가계부 내역을 입력하세요 (끝을 입력하면 저장됩니다)");

        while(true) {
            System.out.print("항목 : ");
            String 항목 =  scanner.nextLine();
            if(항목.equals("끝")){
                break;
            }
            System.out.print("금액 : ");
            int 금액 =   scanner.nextInt(); // 숫자나 소수자리는 작성하고 나면 줄바꿈처리가 되기 때문에 반드시 nextLine() 처리
            scanner.nextLine();

            System.out.print("수입/지출 : ");
            String 수입지출 =   scanner.nextLine();

            accountData.append(getCurrentTime() + " " + 항목 + " " + 금액 + " (" + 수입지출 + ")\n");
            System.out.println("입력이 완료되었습니다.");
        }
        try {
            Files.createDirectories(householdDir);
            Files.writeString(accountFile,accountData.toString(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("가계부 기록이 추가되었습니다.");
            System.out.println("=== 전체 가계부 기록=== \n" + Files.readString(accountFile));
        } catch(IOException e) {
            System.out.println("오류 발생");
        }


    }



    public String getCurrentTime(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}