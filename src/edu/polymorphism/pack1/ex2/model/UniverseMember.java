package edu.polymorphism.pack1.ex2.model;
/*
부모 클래스
name
id
toString
를 작성
 */
public class UniverseMember /*extends Object*/ {
    protected String Name;
    protected String Id;

    public UniverseMember() {
    }

    public UniverseMember(String name, String Id) {
        Name = name;
        this.Id = Id;
    }

    // 게터 세터
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String gettId() {
        return Id;
    }

    public void settId(String Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "학교 멤버 : " +
                "Name='" + Name + '\'' +
                ", tId='" + Id;
    }
}