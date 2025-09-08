package edu.io.pack1.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/************⭐⭐⭐⭐⭐ 개발자 상식 ⭐⭐⭐⭐⭐*************
 OS : 운영 체제

    Windows  / Linux, Mac
    폴더    / 디렉토리

    - 경로 표기 방법(하위 폴더, 파일을 표시하는 형태가 다름)

    백슬래시(\, Windows) -> C:\폴더이름1\폴더이름2\....
      슬래시(/, Linux, Max) -> C:/폴더이름1/폴더이름2/....

    Java 언어의 특징 : 플랫폼(OS)에 독립적으로 윈도우, 리눅스, 맥북에 관계 없이
                       똑같은 코드를 작성 가능한 것처럼
                       \, / 둘 다 호환이 가능
                       (프로그램 실행 시 실행되는 운영체제에 맞게 자동으로 변환하여 사용됨)

    - 경로 표기 방법

    1) 절대 경로 : 하나의(절대적인)기준으로 부터 목표까지의 경로를 모두 표기하는 방법

       - 표기의 기준
        [Windows] : C:/ or D:/
        [Linux, Mac] : /Users, or /

    2) 상대 경로 : 현재 위치를 기준으로 목표까지의 경로를 표기하는 방법

    // 자바에서 특정 경로 없이 파일만 생성하면, 자바 프로그램을 실행하는
    메인 폴더를 기준으로 파이링 생성됨
    java_basic 폴더 아해에 파일이 생성됨

 ***************************************************************/

public class FileService {
    /* File 클래스

    - java.io 패키지

    - 파일 / 디렉토리(폴더) 관리하는 클래스
            (파일/디렉토리 존재 유무 관계 없음)

    - 파일 생성, 제거, 이름, 크기, 마지막 수정일, 존재여부 동의 기능 제공

    - File 클래스 메서드(기능들)

    boolean mkdir()     : 디렉토리 생성(한 개의 폴더만 생성 make directory(=folder))
    boolean mkdirs()    : 경로상에 존재하는 모든 디렉토리 생성(폴더 여러개 한번에 생성 make directory(=folder))
    boolean createNewFile() : 파일 생성
    boolean delete()    : 파일 / 디렉토리 삭제
    String getName()    : 파일 이름 반환
    String parent()     : 파일 저장된 디렉토리 반환
    String getPath()    : 전체 경로 반환
    boolean idFile()    : 현재 File 객체가 관리하는게 파일이면 true
    boolean isDirectory() : 현재 File 객체가 관리하는게 디렉토리이면 true
    boolean exists()    : 파일 / 디렉토리가 존재하면 true, 아니면 false
    long length()       : 파일 크기 반환
    long lastModified   : 파일 마지막 수정일(1970.01.01 9:00)부터 현재까지 지난 시간을 ms 단위로 반환
    String[] list()     : 디렉토리 내 파일 목록을 String[] 배열로 반환
    File[] listFiles()     : 디렉토리 내 파일 목록을 File[] 배열로 반환

     */

    /**
     * File 클래스로 객체 생성
     * + 폴더가 존재하지 않으면 폴더를 생성하자
     */
    public void method1(){
        // 제일 앞 "/" : 최상위 폴더 (== root, 절대 경로의 기준점)

        // C 드라이브 폴더 다음에 io_test 폴더와 gildong 길동 폴더가 존재하는지 확인하고
        // 존재하지 않으면 생성, 존재하면 생성 하지 않음

        File 폴더들 = new File("/io_test/gildong");
        // -> 처음에는 존재하는지 존재하지 않는지 모르겠지만 개발자가 확인하고자 하는
        // 폴더의 명칭(들)을 가지고 있는 File 객체를 폴더들이라는 이름으로 생성

        System.out.println("폴더들의 존재여부 확인 : " + 폴더들.exists());

        // 폴더들.exists(); -> true false

        // 폴더 모두 생성
        폴더들.mkdirs(); // 폴더가 하나가 아닌 io_test 폴더 안에 gildong이라는 폴더를 생성할 예정이기 때문

        System.out.println("마지막 폴더의 명칭 : " + 폴더들.getName());
        System.out.println("마지막 폴더까지 오기 전 모든 경로들 : " + 폴더들.getPath());

    }


    /**
     * File 객체를 이용해서
     * 지정된 위치에 파일 생성하기
     */
    public void method2(){

        File 파일하나 = new File("/io_test/gildong/파일생성확인.txt");

        // 폴더 생성 mkdir() mkdirs()
        // 폴더와 별개로 [파일]을 마지막에 생성할 때
        // 파일 생성할 때
        // 특정 위치에 파일 생성할 때 사용하는 기능]
        // createNewFile()

        try { // 컴퓨터에서 코드를 실행할 때 발생할 수 있는 문제 코드를 실행 시도할 것이다.
            파일하나.createNewFile();
        } catch (IOException e) { // 실행시도할 때 문제가 생성되면
            // 예외상황으로 인하여 자바 전체 프로그램을 중지하는 것이 아니라
            // 특정 기능에 대한 문제를 개발자가 회사나 프로그랭에 알맞는 방향으로
            // 기능이 진행될 수 있도록 설정
            System.out.println("파일을 생성하는 도중 문제가 발생했습니다.");
        } catch (Exception e){
            System.out.println("개발자가 발견하지 못한 문제들 확인 추후 문제들에 대하여 ");
            System.out.println("Exception으로 도달하기 전에 catch 문으로 해당하는 문제에 대해 ");
            System.out.println("개발자가 처리할 수 있도록 문제를 확인하는 공간 ");
            e.printStackTrace(); // 예외 정보 + 예외가 발생한 위치까지의 기능들 추적해서 출력
            System.out.println(e.getMessage()); // e.printStackTrace(); 와 비슷한 형태
            // e.printStackTrace(); e.getMessage() 둘 중 하나 택해서 사용하면 됨
        }


    }

    // method3 c 드라이브 아래에 폴더들 생성
    // io_test/practice/폴더및파일생성.txt
    // 생성하고 생성된 결과 출력
    // 성공적으로 생성 완료되었다면 ㅇㅇ파일이 생성되었습니다.
    // 생성하지 못했다면 ㅇㅇ 파일 생성하지 못했습니다.
    // if 문 활용해서 출력
    public void method3(){
        File fl = new File("/io_test/practice");
        fl.mkdirs();

        File fl2 = new File("/io_test/practice/폴더및파일생성.txt");
        try {
            fl2.createNewFile();
        } catch (IOException e) {
            System.out.println("파일을 생성하는 도중 문제가 발생했습니다.");
        } catch (Exception e){
            System.out.println("개발자가 발견하지 못한 문제들 확인 추후 문제들에 대하여 ");
            System.out.println("Exception으로 도달하기 전에 catch 문으로 해당하는 문제에 대해 ");
            System.out.println("개발자가 처리할 수 있도록 문제를 확인하는 공간 ");
            e.printStackTrace(); // 예외 정보 + 예외가 발생한 위치까지의 기능들 추적해서 출력
            System.out.println(e.getMessage());
        } finally {
            System.out.println("파일 생성을 종료합니다.");
        }

        if(fl2.exists()){
            System.out.println("폴더및파일생성 파일이 생성되었습니다.");
        } else {
            System.out.println("폴더및파일생성 파일을 생성하지 못했습니다.");
        }
    }


    // method4 c드라이브 아래 폴더들 생성
    // io_test/practice/files 폴더 존재 유무 확인

    // 폴더가 존재하면 생성하지 않고, 폴더가 존재하지 않으면 생성

    // io_test/practice/files/method4.txt 생성

    // 생성완료된 결과를 출력

    public void method4(){
        // String path = "/io_test/practice/files";
        // String fileName="/method4.txt";
        // File fPath = new File(path);
        // File fFile = new File(path + fileName);

        // System.out.println("/io_test/practice/files" + "method4.txt");
        // "/io_test/practice/filesmethod4.txt" /io_test/practice 폴더내에 filesmethod4.txt를 제작하는 것임


        File f = new File("/io_test/practice/files");
        if(!f.exists()){
            f.mkdirs();
        }

        File f2 = new File("/io_test/practice/files/method4.txt");
        try {
            f2.createNewFile();
            if(f2.exists()){
                System.out.println(f2.getName() + "파일을 성공적으로 생성했습니다.");
            }
        } catch (IOException e) {
            System.out.println("파일을 생성하는 도중 문제가 발생했습니다.");
            e.printStackTrace(); // 예외 정보 + 예외가 발생한 위치까지의 기능들 추적해서 출력
        } catch (Exception e){
            System.out.println("개발자가 확인해봐야 할 문제가 생겼습니다.");
            e.printStackTrace(); // 예외 정보 + 예외가 발생한 위치까지의 기능들 추적해서 출력
        } finally {
            System.out.println("파일 생성을 종료합니다.");
        }
    }


    /*
    자바개발자들이 만든 File 클래스의 기능들 활용하기

    현재
    C:\Users\tj\Desktop\java-workspace\java_basic
     */
    public void method5(){
        // File 객체 생성

        File directory = new File("/Users/tj/Desktop/java-workspace/java_basic");

        // 저장된 폴더에 있는 모든 파일 / 폴더를 File[] 형태로 얻어오기
        File[] files = directory.listFiles();

        for(File file : files){

            // 파일 이름
            String name = file.getName();

            // 마지막으로 파일을 수정한 날짜
            long lastModified = file.lastModified();

            // SimpleDateFormat : 간단히 날짜 형식을 지정할 수 있는 객체
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

            // 파일을 날짜를 사람들이 읽기편한 형태로 변환
            String date = sdf.format(lastModified); // 변환된 데이터를 String date라는 변수이름에 담기

            // 파일 유형
            String type;

            if(file.isFile()){ // 폴더가 아니라 파일 형태가 맞다면
                type = "파일";
            } else {
                type = "폴더";
            }

            // 파일 크기(byte)

            String size = file.length() + "B";
            if(file.isDirectory()){
                size = ""; // 폴더는 크기를 현재 설정하지 않고 아무런 크기가 없는 상태로 변경
            }

            // 파일이나 폴더 변경될 때마다 출력해서 확인
            System.out.printf("%-20s %-20s %-5s %10s\n", name, date, type, size);

        }
    }
}
