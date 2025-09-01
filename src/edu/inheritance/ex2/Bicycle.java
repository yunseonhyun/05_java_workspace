package edu.inheritance.ex2;

public class Bicycle extends Vehicle {

    private int gearCount;
    private boolean isElectric;


    public Bicycle() {
    }

    public Bicycle(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }

    public Bicycle(String brand, String model, int year, String color, int gearCount, boolean isElectric) {
        super(brand, model, year, color);
        this.gearCount = gearCount;
        this.isElectric = isElectric;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public void start() {
        super.start();
    }

    public void stop() {
        super.stop();
    }

    public void accelerate () {
        System.out.println("자전거가 페달을 밟아 가속합니다.");
    }

    public void brake () {
        System.out.println("자전거가 브레이크를 잡아 감속합니다.");
    }


}

