package edu.exception.pack3.ex.run;

import edu.exception.pack3.ex.model.Cart;
import edu.exception.pack3.ex.service.CartService;
import edu.exception.pack3.ex.service.CartTimeoutException;

import java.util.Scanner;

public class CartRun {
    public static void main(String[] args) throws CartTimeoutException {
        Scanner sc = new Scanner(System.in);
        System.out.println("사용자 아이디를 입력하세요 : ");
        String creatUserId = sc.nextLine();

        Cart cart = new Cart(creatUserId); // userId를 갖고 있는 cart 공간이 생성

        CartService cartService = new CartService();
        cartService.장바구니시간체크기능(cart.getUserId()); // 나중에 html에서 가져온 데이터를 활용할 방법
        //      ---> 지금은 createUserId가 되지만 html을 사용하면서 데이터를 받아오는
        //      추후에는 cart.getUserId()만 사용 가능할 것!

    }
}
