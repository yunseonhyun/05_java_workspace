package edu.polymorphism.ex3.model;

public class Dog extends Animal {
    // 개 전용 필드들
    private String breed; // 품종
    private boolean isTrained;

    // 기본생성자

    public Dog() {
    }

    public Dog(String breed, boolean isTrained) {
        this.breed = breed;
        this.isTrained = isTrained;
    }

    public Dog(String name, int age, String color, String type) {
        super(name, age, color, type);
    }

    public Dog(String name, int age, String color, String type, String breed, boolean isTrained) {
        super(name, age, color, type);
        this.breed = breed;
        this.isTrained = isTrained;
    }

    // 게터 세터
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
                "breed='" + breed + '\'' +
                ", isTrained=" + isTrained +
                '}';
    }


    // 기능들
    public void makeSound() {
            System.out.println(getName() + "이(가) 멍멍! 짖습니다.");
        }


    public void move() {
            System.out.println(getName() + "이(가) 네 다리로 달립니다!");
        }

    public void doSpecialAction() {
        if (isTrained) {
            System.out.println(getName() + "이(가) 앉기를 합니다!");
        } else {
            System.out.println(getName() + "은(는) 아직 훈련이 안되었습니다.");
        }
    }

    public void eat() {
            System.out.println(getName() + "이(가) 사료를 먹습니다.");

    }


}
