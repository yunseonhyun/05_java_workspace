package edu.practice.day7.model;

public abstract  class KakaoService {
    protected String serviceName;
    protected String userId;
    protected String userNickname;
    protected boolean isLoggedIn;
    private String serviceType; // "TALK", "PAY", "MAP"

    // 기본 생성자

    public KakaoService() {
        this.isLoggedIn = false;
    }

    public KakaoService(String serviceName, String userId, String userNickname,String serviceType) {
        this.serviceName = serviceName;
        this.userId = userId;
        this.userNickname = userNickname;
        this.isLoggedIn = false;
        this.serviceType = serviceType;
    }


    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public void login() {
        isLoggedIn = true;
        System.out.println(userNickname + "님이 " + serviceName + "에 로그인했습니다.");
    }

    public void logout() {
        isLoggedIn = false;
        System.out.println(userNickname + "님이 " + serviceName + "에서 로그아웃했습니다.");
    }

    public void showUserInfo() {
        System.out.println("=== 사용자 정보 ===");
        System.out.println("서비스: " + serviceName);
        System.out.println("아이디: " + userId);
        System.out.println("닉네임: " + userNickname);
        System.out.println("로그인 상태: " + (isLoggedIn ? "로그인" : "로그아웃"));
        System.out.println("서비스 타입: " + serviceType);

    }

    public abstract void startService();
    public abstract void stopService();
    public abstract String getServiceType();
    public abstract void performSpecialAction();
    public abstract void sendNotification(String message);


    public abstract void receiveNotification(String message) ;

}