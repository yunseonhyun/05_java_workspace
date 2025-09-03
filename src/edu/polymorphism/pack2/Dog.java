package edu.polymorphism.pack2;

public class Dog extends Animal{
    private String breed; // 견종

    public Dog() {
    }

    @Override
    public void eat() {

    }

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }


    // sleep의 경우 public void 사이에
    // abstrct가 없으므로 작성하지 않아도 됨
    // 필수가 아님~
}
