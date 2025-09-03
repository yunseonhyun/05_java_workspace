package edu.practice.day7.model;

public class KakaoTalk extends KakaoService {
    private int friendCount;
    private boolean isOnline;

    // 생성자
    public KakaoTalk() {
    }


    public KakaoTalk(int friendCount, boolean isOnline) {
        this.friendCount = friendCount;
        this.isOnline = isOnline;
    }

    public KakaoTalk(String serviceName, String userId, String userNickname, boolean isLoggedIn, String serviceType) {
        super(serviceName, userId, userNickname, isLoggedIn, serviceType);
    }

    public KakaoTalk(String serviceName, String userId, String userNickname, boolean isLoggedIn, String serviceType, int friendCount, boolean isOnline) {
        super(serviceName, userId, userNickname, isLoggedIn, serviceType);
        this.friendCount = friendCount;
        this.isOnline = isOnline;
    }

    // 게터 세터
    public int getFriendCount() {
        return friendCount;
    }

    public void setFriendCount(int friendCount) {
        this.friendCount = friendCount;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    //  toString


    @Override
    public String toString() {
        return super.toString() +
                "friendCount=" + friendCount +
                ", isOnline=" + isOnline +
                '}';
    }

    // 기능
    @Override
    public void startService() {

    }

    @Override
    public void stopService() {

    }

    @Override
    public String getServiceType() {
        return "";
    }

    @Override
    public void performSpecialAction() {

    }

    @Override
    public void sendNotification(String message) {

    }

    public void showUserInfo(){
        super.showUserInfo();
        System.out.println("친구 수: " + friendCount);
        System.out.println("온라인 상태: " + (isOnline ? "온라인" : "오프라인"));
    }

    public void sendMessage(String friendName, String message) {}

   public void addFriend(String friendName) {}

   public void changeStatus(boolean online) {}

}
