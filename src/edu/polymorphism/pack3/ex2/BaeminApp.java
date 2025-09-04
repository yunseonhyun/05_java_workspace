package edu.polymorphism.pack3.ex2;

/**
 * 부모클래스 + 필수 구현기능들 작성
 */
public class BaeminApp extends DeliveryApp implements DeliveryService{
    public BaeminApp() {
    }

    public BaeminApp(String userName) {
        super("배달의 민족", userName);
    }

    @Override
    public void orderFood() {
        System.out.println("배민으로 주문이 되었습니다. 라이더가 곧 출발합니다.");
    }

    @Override
    public void trackOrder(String orderId) {
        System.out.println("배민 : 주문번호 : " + orderId + "- 현재 음식 준비중입니다.");
    }
}
