package edu.practice.day4;

import java.util.Scanner;

public class Book {
    Scanner sc = new Scanner(System.in);

    // 필드
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // 기본 생성자
    public Book() {
    }


    // 필수 생성자
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    // 포기화 생성자
    {
        isAvailable = true;
    }

    // setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    // getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }


    // 기능
    public String borrowBook(){
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        if(isAvailable == true){
            String a = String.format("%s님이 '%s' 대출시도\n결과 : %b", name, getTitle(),isAvailable());
            isAvailable = false;
            return a;
        } else {
            System.out.println(name + "님이 '" + getTitle() +"' 대출 시도");
            System.out.println("결과 : 이미 대출중");
            String b= "";
            return b;
        }


    }


}
