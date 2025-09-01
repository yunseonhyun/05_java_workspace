package edu.inheritance.ex2;

public class Car extends Vehicle {

    private String fuelType;
    private int doors;

    public Car() {

    }

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }

    public Car(String brand, String model, int year, String color, String fuelType, int doors) {
        super(brand, model, year, color);
        this.fuelType = fuelType;
        this.doors = doors;
    }

    // 게터 세터
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void accelerate() {
        System.out.println("자동차가 액셀러레이터를 밟아 가속합니다.");
    }

    public void brake() {
        System.out.println("자동차가 브레이크를 밟아 감속합니다.");
    }

    public void honk() {}

    public void openTrunk() {}

}