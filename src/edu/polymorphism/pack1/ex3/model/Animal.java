package edu.polymorphism.pack1.ex3.model;
/*
구현해야할 클래스
Animal (부모클래스)
┗━
 */

// 모든 동물을 하나의 클래스로 처리하는 나쁜 예시
public class Animal {

    // 공통 필드

    private String name;
    private int age;
    private String color;
    private String type; // "개", "고양이", "새"

    // 기본 생성자
    public Animal() {
    }

    public Animal(String name, int age, String color, String type) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.type = type;
    }

    // 게터 세터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // toString

    @Override
    public String toString() {
        return "AnimalBad{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", color='" + getColor() + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }

    // 추후 중괄호 내부에 기능을 작서할 것!
    // 내일부터 인터페이스 추상클래스
    // 지금은 재사용하여 각 class에 맞게 커스텀해야할 기능을
    // 필수로 작성하지 않아도 상속받는 자식 클래스가
    // 정상적으로 작동함
    // 상속을 받을 때 필수로 해야하는 기능에 대해 설정하는 방법
    public void makeSound(){};

    public void move(){};

    public void eat(){}

    public void doSpecialAction(){}


}
