package edu.practice.day6;

import edu.inheritance.Parent;

public class NaverShopping  extends NaverService {
        private int point;
        private int cartCount;

    public NaverShopping() {
    }

    public NaverShopping(String serviceName, String userId, String userNickname, int userLevel, int point, int cartCount) {
        super(serviceName, userId, userNickname, userLevel);
        this.point = point;
        this.cartCount = cartCount;
    }

    // 게터 세터
    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getCartCount() {
        return cartCount;
    }

    public void setCartCount(int cartCount) {
        this.cartCount = cartCount;
    }


    public void login(){
        super.login();
    }

    public void logout(){
        super.logout();
    }

    public void search(){
        System.out.println("상품을 검색합니다.");
    }

    public void writeContent(){
        System.out.println("작성합니다.");
    }

    public void addToCart(){}

    public void buyProduct(){}

    public void showUserInfo() {
        super.showUserInfo();
    }
}