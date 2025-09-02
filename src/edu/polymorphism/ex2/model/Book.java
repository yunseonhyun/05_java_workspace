package edu.polymorphism.ex2.model;

public class Book extends UniverseMember {
    // 도서관 도서 정보 관련 필드들
    private String bookTitle;
    private String bookAuthor;
    private String bookIsbn;
    private boolean isBookCheckedOut; // 대출 여부
    private String checkoutUser; // 대출한 사용자


}
