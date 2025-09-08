package edu.exception.pack3.ex.model;

import java.time.LocalDateTime;

/*
장바구니 모뎅
 */
public class Cart {
    private String userId;
    private LocalDateTime createTime;

    public Cart(String userId) {
        this.userId = userId;
        this.createTime = LocalDateTime.now(); // 장바구니 생성된 시간은 개발자가 설정!
        // 현재 시간을 작성
    }

    // 게터 세터
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
