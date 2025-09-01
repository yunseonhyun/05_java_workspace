package edu.practice.day6;

public class NaverBlog extends NaverService {
    private int postCount;
    private int visitorCount;

    public NaverBlog() {

    }

    public NaverBlog(String serviceName, String userId, String userNickname, int userLevel, int postCount, int visitorCount) {
        super(serviceName, userId, userNickname, userLevel);
        this.postCount = postCount;
        this.visitorCount = visitorCount;
    }

    // getter setter
    public int getPostCount() {
        return postCount;
    }

    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }

    public int getVisitorCount() {
        return visitorCount;
    }

    public void setVisitorCount(int visitorCount) {
        this.visitorCount = visitorCount;
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
        System.out.println("블로그에서 포스트를 검색합니다.");
    }

    public void writeContent() {
        System.out.println("블로그 포스트를 작성합니다.");
    };

    public void addNeighbor(){
        visitorCount++;
        System.out.println("방문자 수 : " + visitorCount);
    }

    public void customizeTheme(){}
}