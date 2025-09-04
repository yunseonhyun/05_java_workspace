package edu.polymorphism.pack3.ex2;
// 배달 기능에 대해 작성된 문서
public interface DeliveryService {

    void orderFood();                   // 음식을 주문하는 기능
    void trackOrder(String orderId);    // 주문ID에 따라 주문을추적하는 기능
}
