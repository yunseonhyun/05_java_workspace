package edu.inheritance.ex3;

public class GoogleServiceRun {
    public static void main(String[] args) {

        // 1. Gmail 객체 생성
        Gmail gmail = new Gmail("user@gmail.com", "홍길동", "개인계정", 150, 80);


        // 2. YouTube 객체 생성
        Youtube youTube = new Youtube("user1@gmail.com", "박길동", "개인계정", 50, true);

        System.out.println("=== 구글 서비스 사용자 정보 ===");
        gmail.showUserInfo();
        youTube.showUserInfo();

        System.out.println("\n=== 로그인 ===");
        gmail.login();
        youTube.login();

        System.out.println("\n=== 서비스별 검색 ====");
        gmail.search();
        youTube.search();

        System.out.println("\n=== 서비스별 고유 기능 ===");
        gmail.sendEmail();

        youTube.uploadVideo();
        youTube.subscribe();
        youTube.watchAd();

        System.out.println("구독자 수 : " + youTube.get구독자수() + "명");

        System.out.println("\n=== 로그아웃 ===");
        gmail.logout();
        youTube.logout();
    }
}
