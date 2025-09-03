package edu.practice.day7.model;

public class KakaoMap extends KakaoService{

    private String currentLocation;
    private boolean isGPSEnabled;

    // 생성자
    public KakaoMap() {
    }


    public KakaoMap(String currentLocation, boolean isGPSEnabled) {
        this.currentLocation = currentLocation;
        this.isGPSEnabled = isGPSEnabled;
    }

    public KakaoMap(String serviceName, String userId, String userNickname, boolean isLoggedIn, String serviceType) {
        super(serviceName, userId, userNickname, isLoggedIn, serviceType);
    }

    public KakaoMap(String serviceName, String userId, String userNickname, boolean isLoggedIn, String serviceType, String currentLocation, boolean isGPSEnabled) {
        super(serviceName, userId, userNickname, isLoggedIn, serviceType);
        this.currentLocation = currentLocation;
        this.isGPSEnabled = isGPSEnabled;
    }

    // 게터 세터
    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public boolean isGPSEnabled() {
        return isGPSEnabled;
    }

    public void setGPSEnabled(boolean GPSEnabled) {
        isGPSEnabled = GPSEnabled;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
                "currentLocation='" + currentLocation + '\'' +
                ", isGPSEnabled=" + isGPSEnabled +
                '}';
    }

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

    public void showUserInfo() {
        super.showUserInfo();
        System.out.println("현재 위치: " + currentLocation);
        System.out.println("GPS 상태: " + (isGPSEnabled ? "활성화" : "비활성화"));
    }
}
