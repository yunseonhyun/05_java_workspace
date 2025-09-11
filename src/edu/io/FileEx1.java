package edu.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class FileEx1 {

    // 예전에는 사용자가 컴퓨터나 핸드폰, 디바이스 기기에 저장한 명칭을 최대한 사용하여
    // 회사 내부에 파일을 저장    사용자사진_1   사용자사진_현재시간 과 같은 방법을 사용
    // 코드가 너무 길어지고 사진 관리하기가 어려워짐
    // 파일 명칭을 사용자에게 맞추는 것이 아니라 회사 규율에 맞게 사진을 저장하여
    // 사용자의 프로필사진이나, 갤러리에서 사진을 확인할 수 있도록 기능 설정
    public void 고전방식(){

        String originName = "사용자가 저장한 사진이름.png";

        Path path = Path.of("회사에서 사용자가 ㅇ버로드한 파일을 저장할 폴더 위치", originName);

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


    public void 회사에서사진저장하는기능1(String imgUrl){

        String 회사에서사용할기본Name = "회사이름" + System.currentTimeMillis() + ".jpg";
        Path path = Path.of("c:", "회사이름", 회사에서사용할기본Name);

        try {
            Files.createDirectories(path.getParent());
            System.out.println("파일 생성 완료");
            URL url = new URL(imgUrl);
            InputStream in = url.openStream();
            Files.copy(in, path);


        } catch (IOException e) {
            System.out.println("오류 발생");
        }
    }


    public void 회사에서사진저장하는기능2(String imgUrl){

        String 회사에서사용할기본Name = "회사이름" + System.currentTimeMillis() + ".jpg";
        Path path = Path.of("c:", "회사이름", 회사에서사용할기본Name);

        try {
            Files.createDirectories(path.getParent());
            URL url = new URL(imgUrl);
            // InputStream in = url.openStream(); 사용해도 되긴 하지만
            // 데이터를 여러번 사용하고 작업할 일이 존재하지 않으면
            // 아래와 같이 한 번에 작성하여 저장해도 문제 없이 저장 잘 됨
            // Files.copy(url.openStream() ,path); 로 파일 갖고오고 갖고온 파일저장 한 번에 완성 가능

            // inputStream에서 가져온 이미지 데이터가 존재하는 위치, 회사 컴퓨터에 저장할 위치 + 파일
            InputStream in = url.openStream();
            Files.copy(in, path);


        } catch (IOException e) {
            System.out.println("오류 발생");
        }
    }


    /**********************************************************
     *                  InputStream의 변천사
     **********************************************************/

    public void defaultInputStream(){
        try {

            Path path = Path.of("폴더위치/파일이름.확장자이름");
            URL url = new URL("이미지주소");
            InputStream inputStream = url.openStream();
            // 한 번에 데이터를 가져올 수 있는 최대 공간 크기
            // 1KB = 1024
            // 1MB = 1024 * 1024 번 갖고오기
            byte[] buffer = new byte[1024]; // 최대 1024 바이트식 가져올 수 있다.
            FileOutputStream outputStream = new FileOutputStream(path.toFile()); // 주소에서 가져온 파일이름

            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
            inputStream.close();
            outputStream.close();

        } catch (MalformedURLException e) {
            System.out.println("InputStream에서 데이터를 가져올 수 있도록 데이터 들어올 수 있게 문 열어주기에서 발생하는 문제들");
        } catch (IOException e) {
            System.out.println("url 연결부터 발생할 수 있는 각종 IO 관련 문제들");
        }
    }


    public void 경로결합() {
        Path dir = Path.of("폴더1/폴더2");

        Path file = dir.resolve("파일이름.txt");

        // resolve() : 기존 경로와 새로운 경로나 파일을 결합하는 기능
        // file에는 폴더1/폴더2/파일이름.txt로 결합해서 사용하는 기능

    }

    /************************************************
     * StandardOpenOption      StandardCopyOption
     * 주로 StandardOpenOption 정도만 사용 ... (CREARE, APPEND)
     ************************************************/
    Path path = Path.of("폴더1/폴더2/파일이름.확장자이름");

    public void StandardOpenOptionMethod() throws IOException {
        // 가장 많이 사용하는 형식 파일없으면 생성 있으면 내용 이어서 작성하기
        Files.writeString(path, "로그내용\n", StandardOpenOption.CREATE,StandardOpenOption.APPEND);
        // 파일 무조건 새로 생성 이어서 작성되지 않음
        Files.writeString(path, "로그내용\n", StandardOpenOption.CREATE);
        // 파일 무조건 이어서 작성만 가능 파일이 존재하지 않을 경우 에러 발생
        Files.writeString(path, "로그내용\n", StandardOpenOption.APPEND);

        // 새 파일만 생성 (기존 파일 존재하면 오류) 기존파일 건들지 않고 새로 만들기만 진행할 때 사용
        Files.writeString(path, "로그내용\n", StandardOpenOption.CREATE_NEW);

        // 임시 파일의 경우 파일을 작성하면서 프로그램이 종료되거나, 파일을 닫음과 동시에 바로 삭제
        Files.writeString(path, "로그내용\n", StandardOpenOption.CREATE, StandardOpenOption.DELETE_ON_CLOSE);


        // 대상 파일이 이미 존재해도 덮어쓰기
        Files.copy(path, path, StandardCopyOption.REPLACE_EXISTING);
        Files.move(path, path, StandardCopyOption.REPLACE_EXISTING);

        // 파일의 속성(생성일, 수정일)도 함께 복사
        Files.copy(path, path, StandardCopyOption.COPY_ATTRIBUTES);

        // 파일을 복제할 때 제일 많이 사용하는 방법
        Files.copy(path, path, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);

        // 파일 이동을 원칙적으로 수행 (파일을 이동하던 도중 이동 실패하면 원상복구)
        // ATOMIC_MOVE의 경우 C드라이브에서 C드라이브 내에 존재하는 것만 보존
        //                    C드라이브에서 D드라이브로 이동하는 것은 원상복구 불가능
        //                    한국에서 서울 -> 부산으로 이동하다가 문제 생기는 것은 복구가 가능하지만
        //                    한국에서 중국이나 일본으로 이동하다 문제 생기면 복구 불가
        Files.move(path, path, StandardCopyOption.ATOMIC_MOVE);

        // 안전하게 파일을 이동하는 방법 파일이동하다 실패하면 기존 파일 그대로 위치 유지
        Files.move(path, path, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
    }

    /*
    Files.writeString(파일경로.파일명칭.확장자이름, 파일내용문);
    파일에 문자열을 작성하는 기능
     */
    public void writeStringMethod() throws IOException {
        // 1. 가장 간단한 방법(파일이 없으면 생성, 있으면 덮어쓰기)
        Files.writeString(path, "안녕하세요");

        // 2. 옵션과 함께 사용 반드시 이어서 작성할 때는 CREATE, APPEND를 함께 사용
        // 만약에 CREATE 없이 APPEND만 사용했는데, 파일이 없을 경우 -> 파일없음 예외 상황 발생
        // CREATE만 사용할 경우 -> 계속 새로 만들며, 문자가 이어서 작성되지 않음 흡사 덮어쓰기형태
        Files.writeString(path, "내용", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    /*
    Files.readString(읽어올 파일경로.파일명칭.확장자이름);
    파일에 작성된 문자열을 읽는 기능
     */
    public void reaStrinMethod() throws IOException {
        Files.readString(path);
        // Files.readString(path, StandardOpenOption.READ); 이미 READ가 기본값이기 때문에 추가 작성 불가

    }



}
