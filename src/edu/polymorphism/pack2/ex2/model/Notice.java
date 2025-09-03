package edu.polymorphism.pack2.ex2.model;

public class Notice extends Post {
    private String priority; // 중요도

    // 기본 생성자
    public Notice() {
    }

    // 매개변수 생성자
    public Notice(String priority) {
        this.priority = priority;
    }

    public Notice(String postId, String title, String author, String content) {
        super(postId, title, author, content);
    }

    public Notice(String postId, String title, String author, String content, String priority) {
        super(postId, title, author, content);
        this.priority = priority;
    }

    // 게터 세터
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }


    // 기능
    @Override
    public void displayPost() {
        System.out.println("[공지사항] {" + getTitle() + "} 작성자 : {" + getAuthor() + "} 중요도 : {" + getPriority() + "} 내용 : {" + getContent() + "}");
    }

}
