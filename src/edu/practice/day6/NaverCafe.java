package edu.practice.day6;

public class NaverCafe extends NaverService {
    private String cafeGrade;
    private int articleCount; // 작성글 수

    public NaverCafe() {

    }

    public NaverCafe(String serviceName, String userId, String userNickname, int userLevel, String cafeGrade, int articleCount) {
        super(serviceName, userId, userNickname, userLevel);
        this.cafeGrade = cafeGrade;
        this.articleCount = articleCount;
    }

    // getter setter
    public String getCafeGrade() {
        return cafeGrade;
    }

    public void setCafeGrade(String cafeGrade) {
        this.cafeGrade = cafeGrade;
    }

    public int getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }


    public void login(){
        super.login();
    }

    public void logout(){
        super.logout();
    }

    public void showUserInfo() {
        super.showUserInfo();
    }

    public void search(){
        System.out.println("카페에서 게시글을 검색합니다.");
    }

    public void writeContent() {
        System.out.println("카페 게시글을 작성합니다.");
    };

    public void joinCafe(){}

    public void uploadFile(){}

}