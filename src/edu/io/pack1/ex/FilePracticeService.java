package edu.io.pack1.ex;

import java.io.File;
import java.io.IOException;

public class FilePracticeService {
    //제공된 FileService.java의 개념(File 객체 생성,
    // mkdirs(), createNewFile(), exists(), listFiles() 등)을
    // 활용하여 다음 문제들을 해결해 보세요.
    String directory = "/io_test/temp";

    // 문제 1 : 상대 경로를 이용한 폴더 및 파일 생성
    public void method1(){
        String path = "my_logs"; // 폴더 명칭 맨 앞에 /가 붙지 않으면 현재 작업하고 있는 위치를 기준이됨
        File 폴더 = new File(path);
        File file = new File(path + "/access_log.log");
        if(!폴더.exists()){
            폴더.mkdir();
            System.out.println(path + "폴더 생성 완료");
        } else {
            System.out.println("폴더 이미 존재");
        }

            try {
                file.createNewFile();
                if(file.exists()){
                    System.out.println(file + "파일 생성 성공");
                }
            } catch (IOException e) {
                System.out.println("오류가 발생했습니다");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("예기치 못한 오류가 발생하였습니다.");
                e.printStackTrace();
            } finally {
                System.out.println("파일 생성을 종료합니다.");
            }



    }

    // 문제 2 : 기존 디렉토리 목록 조회 및 유형 판별
    public void method2(){
        /*
        폴더 내 전체 경로 및 파일 확인 명령아 :
        cmd 창에서 : tree /f 폴더별 파일들 모두 확인 가능
         */
        File file = new File("src/edu/oop/method/ex");
        File[] files = file.listFiles();

        for(File file1 : files){
            // 파일 이름
            if(file1.isFile()){
                System.out.println(file1.getName() + "[파일]");
            } else if(file1.isDirectory()){
                System.out.println(file1.getName() + "[폴더]");
            }
        }

    }

    // 문제 3 : 파일 생성 확인 및 삭제 처리
    public void method3(){
        File file = new File(directory);
        File file1 = new File(directory + "/delete_target.txt");
        if(!file.exists()){
            file.mkdir();
        } else {
            System.out.println("이미 파일 존재");
        }

            try {
                file1.createNewFile();
                if(file1.exists()){
                    System.out.println(file.exists());
                }
            } catch (IOException e) {
                System.out.println("오류 발생");
            } catch (Exception e) {
                System.out.println("개발자가 확인해야할 오류 발생");
            }
            System.out.println(file.exists());

        if(file1.exists()){
            file1.delete();
        }
        if(!file1.exists()){
            System.out.println("파일 삭제 완료");
        } else {
            System.out.println("파일 삭제 실패");
        }
    }

}
