package edu.exception.pack3.ex.service;

/**
 * 개발자가 필요에 의해 강제 중단 상황을 만들고
 * 강제 중단 사황에 따른 대처를 service에서 진행한다.
 *
 * ex) 티켓예매 사이트에서
 *              동일한 아이디가 다른 주소 3개 접속되어 있는 것을 발견
 *              동일한아이디동시접속 Exception extends Exception
 *
 *              --> 동일한 아이디가 여러 곳에서 티켓팅을 하려고 접속한 것을 확인 했습니다.
 *                  모두 로그아웃 처리를 진행합니다.와 같이 설정해줄 수 있음
 *   결제처리 = 결제시간만료 / 다른사람이 먼저 결제했고, 상품이 품절됐을 때 결게 기능 중단처리
 *   쿠폰적용
 *   은행송금 (잔고보다 더 큰 금액 보낼 때  보내기 기능 자체 중지)
 *
 *   등 정기적인 보안 감시와 해킹에 대한 보안 방지 회사 규칙 강제 등 활용
 *
 */
public class CartTimeoutException extends Exception {
    public CartTimeoutException(String message) {
        super(message); // 나중에 CartTimeoutException("작성한 내용") 대로 출력할 수 있게 설정
    }
}
