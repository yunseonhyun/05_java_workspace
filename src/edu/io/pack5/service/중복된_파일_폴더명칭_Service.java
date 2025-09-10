package edu.io.pack5.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class 중복된_파일_폴더명칭_Service {
    /*
    do-while을 이용해서 파일이름_숫자.png
    완성하기
    do-while은 while() 내부가 true, false 관계없이
                무조건 최초 1회는 do 안에 있는 구문을 무조건 실행하고 결과 출력
     */
    public void saveImage1(){

        String originName = "사진.png";

        Path path = Path.of("profiles", "member01", originName);
        int dot = originName.lastIndexOf('.'); // . 이 몇번째에 존재하는지 확인
        String baseName = originName.substring(0, dot); // 파일이름 처음부터 .이 존재하기 전까지의 파일 명칭
        String extName = originName.substring(dot); // . 확장자 이름을 가지고 있는 상태
        System.out.println("dot . 의 위치 : " + dot);
        System.out.println("baseName : " + baseName);
        System.out.println("extName : " + extName);

        int count = 1;

        do{ // while() 안에 있는 값이 true false 상관없이 무조건 최초 1회 실행
            //                사진       -    숫자     .png
            String NewName = baseName + "_" + count + extName;
            System.out.println("newName : " + NewName);

            path = Path.of("profiles", "member01", NewName); // 기존이름 ->  숫자가 붙은 이름 변경
            count++; // 사진_1이 존재하면 숫자를 계속 올려서 존재하지 않는 이름이 나올 때까지 숫자값 상승

        } while (Files.exists(path)); // 파일이름이 존재하면 존재하는 파일 이름이 없을 때 까지 반복

        try {
            Files.createDirectories(path.getParent()); // profile / member01까지만 포함
            String imgURL = "https://thvnext.bing.com/th/id/OIP.bxmQVb-ZrWT3AuoyyUAamwHaE8?w=274&h=183&c=7&r=0&o=7&cb=ucfimgc2&pid=1.7&rm=3";
            URL url = new URL(imgURL);
            InputStream in = url.openStream();
            Files.copy(in, path);
            in.close(); // 메모리 누수 방지를 위해서 시시간으로 데이터를 받아오는 stream 종료


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
    }

    /*
    while을 이용해서 원본파일이름 이외
    동일한 파일명칭이 없을 때까지 반복수행
    조건이 true이어야지만 실행
     */
    public void saveImage2(){

        String originName = "사진.png";

        Path path = Path.of("profiles", "member01", originName);
        int dot = originName.lastIndexOf('.'); // . 이 몇번째에 존재하는지 확인
        String baseName = originName.substring(0, dot); // 파일이름 처음부터 .이 존재하기 전까지의 파일 명칭
        String extName = originName.substring(dot); // . 확장자 이름을 가지고 있는 상태
        System.out.println("dot . 의 위치 : " + dot);
        System.out.println("baseName : " + baseName);
        System.out.println("extName : " + extName);

        int count = 1;

        while(Files.exists(path)) {
           // 존재하지 않으면 알아서 while문 종료


            String NewName = baseName + "_" + count + extName;
            System.out.println("newName : " + NewName);

            path = Path.of("profiles", "member01", NewName);
            count++;

        }

        try {
            Files.createDirectories(path.getParent()); // profile / member01까지만 포함
            String imgURL = "https://thvnext.bing.com/th/id/OIP.bxmQVb-ZrWT3AuoyyUAamwHaE8?w=274&h=183&c=7&r=0&o=7&cb=ucfimgc2&pid=1.7&rm=3";
            URL url = new URL(imgURL);
            InputStream in = url.openStream();
            Files.copy(in, path);
            in.close(); // 메모리 누수 방지를 위해서 시시간으로 데이터를 받아오는 stream 종료


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
    }

    /*
    타임 스탬프
    현재시간을 이용해서 현재시간으로 명칭 구분
    System.currenrTimeMillis()

    1970년 1월 1일 00:00:00 부터 현재가지 얼마나 흘렀는지 숫자로 나타낸 것
    0.001초로 매우 정밀하며, 이 정밀함을 넘어서 동일한 사진명칭이다
    동시에 같은 파일을 저장해도 회사컴퓨터로 데이터 저장이 순차적으로 넘어오기 때문에
    겹칠일이 없음
     */

    public void saveImage3(){

        String originName = "사진.png";

        Path path = Path.of("profiles", "member01", originName);

        int dot = originName.lastIndexOf('.'); // . 이 몇번째에 존재하는지 확인
        String baseName = originName.substring(0, dot); // 파일이름 처음부터 .이 존재하기 전까지의 파일 명칭
        String extName = originName.substring(dot); // . 확장자 이름을 가지고 있는 상태
        System.out.println("dot . 의 위치 : " + dot);
        System.out.println("baseName : " + baseName);
        System.out.println("extName : " + extName);



        while(Files.exists(path)) {
            // 존재하지 않으면 알아서 while문 종료


            String NewName = baseName + "_" + System.currentTimeMillis() + extName;
            System.out.println("newName : " + NewName);

            path = Path.of("profiles", "member01", NewName);


        }

        try {
            Files.createDirectories(path.getParent()); // profile / member01까지만 포함
            String imgURL = "https://thvnext.bing.com/th/id/OIP.bxmQVb-ZrWT3AuoyyUAamwHaE8?w=274&h=183&c=7&r=0&o=7&cb=ucfimgc2&pid=1.7&rm=3";
            URL url = new URL(imgURL);
            InputStream in = url.openStream();
            Files.copy(in, path);
            in.close(); // 메모리 누수 방지를 위해서 시시간으로 데이터를 받아오는 stream 종료


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
    }

    public void saveImage4(){

        String originName = "사진.png";

        Path path = Path.of("폴더1",originName);
        int dot = originName.lastIndexOf('.');
        String baseName = originName.substring(0, dot);
        String extName = originName.substring(dot);

        int count = 1;

        while(Files.exists(path)) {
            // 존재하지 않으면 알아서 while문 종료


            String NewName = baseName + "_" + count + extName;
            System.out.println("newName : " + NewName);

            path = Path.of("폴더1", NewName);
            count++;

        }
            String imgURL = "https://thvnext.bing.com/th/id/OIP.bxmQVb-ZrWT3AuoyyUAamwHaE8?w=274&h=183&c=7&r=0&o=7&cb=ucfimgc2&pid=1.7&rm=3";

        try {
            Files.createDirectories(path.getParent());
            URL url = new URL(imgURL);
            InputStream in = url.openStream();
            Files.copy(in, path);
            in.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
    }


    // profiles/member01 폴더 안에 사진.png라는 명칭이 존재하면 (숫자)로 파일이름이 덮어쓰기 되지 않도록 설정
    public void saveImage5() {
        // data:image/jpes;base64,/ = 데이터 숫자 자체값이어서 주소로 읽으르 수 없음
        String imgUrl = "https://thvnext.bing.com/th/id/OIP.gkSVO6XV6kaiqB36IeHDhwHaE7?w=245&h=180&c=7&r=0&o=7&cb=ucfimgc2&pid=1.7&rm=3";
        String originName = "사진.png";

        Path path = Path.of("profiles", "member01", originName);


        int 마침표위치 = originName.lastIndexOf('.'); // 마지막에 위치한 마침표의 위치
        String 확장자없는이름 = originName.substring(0, 마침표위치);
        String 확장자이름 = originName.substring(마침표위치); // 마침표위치부터 모두다 마지막까지
        int 숫자 = 1;

        while(Files.exists(path)) {
            String 새로운이름 = originName + "(" + 숫자 + ")" + 확장자이름;
            path = Path.of("profiles", "member01", 새로운이름);
            // 혹시나 현재 작성한 숫자 번호를 포함한 전체이름이 파일에 존재할 수 있으므로
            // 미리 숫자번호를 +1 하여 댑해둔다.
            숫자++;
        }
        try {
            Files.createDirectories(path.getParent()); // 만약에 폴더 없으면 추가

            URL 인터넷주소다 = new URL(imgUrl);
            InputStream 인터넷에서사진갖고오기 = 인터넷주소다.openStream();
            Files.copy(인터넷에서사진갖고오기, path);
            System.out.println(path + "사진 저장을 완료했습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
