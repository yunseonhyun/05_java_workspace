package edu.inheritance.ex2;

public class Motorcycle extends Vehicle {
    private int engineSize;
    private boolean hasHelmet;

    public Motorcycle() {
    }

    public Motorcycle(String brand, String model, int year, String color) {
        super();
    }

    public Motorcycle(String brand, String model, int year, String color, int engineSize, boolean hasHelmet) {
        super(brand, model, year, color);
        this.engineSize = engineSize;
        this.hasHelmet = hasHelmet;
    }

    // 게터 세터
    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public boolean isHasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }


    // 기능
    public void start() {
        super.start();
    }

    public void stop() {
        super.stop();
    }

    public void accelerate() {
        System.out.println("오토바이가 스로틀을 돌려 가속합니다.");
    }

    public void brake() {
        System.out.println("오토바이가 브레이크 레버를 당겨 감속합니다.");
    }

}