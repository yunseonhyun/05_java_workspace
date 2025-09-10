package edu.io.pack5.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class 프로필사진service {

    public void createProfileFolder(String member, String picture){

        // 1. 회원 프로필 이미지를 저장할 폴더 경로 생성
        Path memberFolder1 = Path.of("profiles", member);
        // Path memberFolder2 = Path.of("profiles", "members02");

        // 2. 폴더 생성
        try {
            Files.createDirectories(memberFolder1);
           // Files.createDirectories(memberFolder2);

            // 3. 폴더 내에 프로필 사진 저장하기
            Path picture1 = Path.of("profiles", member, picture);
            // Path picture2 = Path.of("profiles", "members02", "프로필사진02.txt");

            Files.writeString(picture1, "프로필 사진 이미지 입니다.");
            // Files.writeString(picture2, "프로필 사진 이미지 입니다.");

            System.out.println("프로필 사진이 개별 폴더로 저장 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제가 발생 했을 때 문제 해결");
            // 1. 메인 서버가 끊기면 2번 째 후보 서버로 저장 시작
            // 2. 이미지가 5MB 이상 초과되면 저장 못하게하고, 5MB 초과할 수 없음을 사용자에게 알리기
        }
    }


    // 이미지 주소로 이미지 저장하기
    public void saveImg(String imgurl){
        // String imgUrl = "https://flexible.img.hani.co.kr/flexible/normal/960/960/imgdb/resize/2019/0121/00501111_20190121.webp";


        Path memberFolder1 = Path.of("profiles", "member06");

        try {
            Files.createDirectories(memberFolder1);
            Path picture1 = Path.of("profiles", "member06", "사진1.png");

            // 4. 이미지 주소에서 이미지 다운로드 처리 후
            System.out.println("이미지 다운로드 중 ...");
            // URL = 클라이언트가 작성한 이미지 주소를 java에서 (읽거나 쓰거나) 사용할 수 있도록 설정하는 문서
            URL url = new URL(imgurl);

            // InputStream = 인터넷에서 데이터가 흘러들어오는 통로를 만듬
                                    // 이미지 주소에서 데이터가 들어올 수 있도록 통로를 열어두는 기능
            InputStream inputStream = url.openStream();


            // 5. 파일로 저장하기
            // 인터넷에 존재하는 이미지를 내 컴퓨터에 복제          선택사항     기존에 이미지이름이 존재하면 덮어쓰기 형태로 이미지이름에 현재 저장하는 이미지 데이터를 설정
            Files.copy(inputStream, picture1, StandardCopyOption.REPLACE_EXISTING);
            // 데이터를 모두 가져오고, 가져온 데이터를 복사해서 내 컴퓨터에 저장이 완료되면,
            // 데이터가 들어올 수 있는 통로 닫아두기 설정을 해주어야ㅐ 저장이 완료됨
            inputStream.close();
            System.out.println("프로필 사진이 개별 폴더로 저장 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제가 발생 했을 때 문제 해결");
        }
    }


    // profiles     member07 내부에 복사한 이미지 저장
    public void saveImg2(String imgurl){
        Path memberFolder1 = Path.of("profiles", "member07");

        try {
            Files.createDirectories(memberFolder1);
            Path picture1 = Path.of("profiles", "member07", imgurl);

            System.out.println("이미지 다운로드 중 ...");
            URL url = new URL(imgurl);

            InputStream inputStream = url.openStream();

            // 로 복사해서 저장하기      인터넷상에서 가져온 데이터이미지를, 이미지이름.png
            Files.copy(inputStream, picture1);

            inputStream.close();
            System.out.println("이미지 저장 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("이미지 저장 중 문제가 발생 했을 때 문제 해결");
        }
    }

    public void saveImg3(String imgName){
        Path memberFolder1 = Path.of("profiles", "member08");

        try {
            String imgurl = "https://flexible.img.hani.co.kr/flexible/normal/960/960/imgdb/resize/2019/0121/00501111_20190121.webp";
            Files.createDirectories(memberFolder1);
            Path picture1 = Path.of("profiles", "member08", imgName);

            System.out.println("이미지 다운로드 중 ...");
            URL url = new URL(imgurl);

            InputStream inputStream = url.openStream();
            // 이미지를 복사해서 저장한다는 의미를 쓰는 이유
            // 웹에 있는 이미지를 그대로 복제해서 내 컴퓨터 안에 저장하는 것이기 때문
            // 웹에 있는 이미지를 내 컴퓨터 안에 저장한다하여 웹에 존재한느 이미지가 사라지는 것은 아니기에
            // 웹 이미지를 복제하여 내 컴퓨터에 저장한다  .copy()를 사용함

            Files.copy(inputStream, picture1); // 똑같은 이름의 이미지가 존재할 때 덮어쓰기가 안됨

            inputStream.close();
            System.out.println("이미지 저장 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("이미지 저장 중 문제가 발생 했을 때 문제 해결");
        }
    }


    // Scanner를 이용하여 폴더이름 이미지이름 사용자에게 전달받고
    // 폴더 안에 이미지를 웹에서 복제하여 저장
    // 확장자는 .png 사용
    /*
    png = 투명도를 지원하는 비손실 압축
           로고, 아이콘 투명배경이 필요한 이미지 사용
           파일 크기 큼, 여러번 수정해야할 때 주로 사용
    jpg = 투명도를 지원하지 않는 손실 압축
          사진, 그라데이션, 배너 등 완성된 사진을 압축하여 데이터 그기를 줄여 사용할 때 용이
    svg = 확장 가능한 이미지
          이미지를 아무리 확대하거나 축소해도 절대 깨지지 않는 디지털 이미지 형식
          수학 공식으로 이미지를 설계
          화면 크기에 맞춰 매번 공식을 다시 계산 후 표현되기 때문에, 디바이스에서 유용하게 사용되는 이미지
          코드 기반 이미지

     */
    // 외부 url을 통해 이미지를 가져올 때 자바에서 접근할 수 없는 주소도 존재함
    // 사이트마다 권한에 따른 문제

    // Scanner로 원하는 이미지 주소를 넣었을 때 권한 문제 없이 정상적으로 작동
    public void saveImg4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("저장할 사진의 주소를 입력해주세요 : ");
        String imgUrl3 = sc.nextLine();
        System.out.print("폴더이름을 입력해주세요 : ");
        String folName = sc.nextLine();
        System.out.print("이미지 이름을 입력해주세요 : ");
        String imgName = sc.nextLine() + ".png";

        Path mf1 = Path.of("profiles", folName);


        try {
            // 폴더가 없을 경우 생성 있으면 false 넘어가기
            Files.createDirectories(mf1);
            // 폴더 안에 이미지까지 바라보는 경로
            Path mf2 = Path.of("profiles", folName, imgName);
            System.out.println("이미지 다운로드 중 ...");

            URL url = new URL(imgUrl3);

            // InputStream = 인터넷에서 데이터가 흘러들어오는 통로를 만듬
            // 이미지 주소에서 데이터가 들어올 수 있도록 통로를 열어두는 기능
            InputStream inputStream = url.openStream();

            Files.copy(inputStream, mf2);
            inputStream.close();
            System.out.println("사진 저장 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("이미지 다운로드 실패");
            // 더 자세한 오류 정보 제공
            if(e.getMessage().contains("403")) {
                System.out.println("403 오류 : 위키디아에서 접근을 거부했습니다. 함부로 들어와서 다운로드 할 수 없다네요..");
            }
        }

    }


}
