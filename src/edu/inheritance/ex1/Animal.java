package edu.inheritance.ex1;

public class Animal {
    // 필드 속성 인스턴스 변수
    private String name;
    private int age;
    private String color;

    // 기본생성자
    public Animal() {
    }

    // 기능들 = 메서드
    // Dog dog2 = new Dog();
    // Cat cat1 = new Cat();
    // Bird bird = new Bird();

    // 위와 같이 Animal을 상속받는 생성자들의 기본생성자를 사용하기 위해서는
    // 상속해주는 Animal 자체에서 기본 생성자가 존재해야 함
    // 필수생성자
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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


    // 개발자가 필요로 하는 기타 메서드들
    public void eat() {
        System.out.println(getName() + "이(가) 음식을 먹고 있습니다.");
    }

    public void sleep() {
        System.out.println(getName() + "이(가) 잠을 자고 있습니다.");
    }

    public void showInfo(){
        System.out.println("=== 동물 정보 ===");
        System.out.println("이름 : " + getName());
        System.out.println("나이 : "  + getAge());
        System.out.println("색깔  : " + getColor());
    }

    public void makeSound() {

    }

    public void move() {

    }
}
