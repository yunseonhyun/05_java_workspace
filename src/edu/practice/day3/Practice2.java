package edu.practice.day3;

public class Practice2 {
    private String model; // 모델명
    private int batteryLevel; // 배터리 잔량 100최대
    private boolean isPowerOn = false; // 전원상태, 기본값 false

    // 기본 생성자
    public Practice2() {
    }


    // 필수 생성자
    public Practice2(String model, int batteryLevel) {
        this.model = model;
        this.batteryLevel = batteryLevel;
    }


    // setter
    public void setModel(String model) {
        this.model = model;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }


    //getter
    public String getModel() {
        return model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }


    // 기능
    public void method2() {
        if(batteryLevel == 100) {
            System.out.println("Galaxy S24의 전원 켜졋습니다");
        } else {
            System.out.println("배터리를 " + (100 - batteryLevel) + "% 사용했습니다.");
        }
        System.out.println("=== 스마트폰 상태 ===");
        if(batteryLevel > 0) {
            isPowerOn = true;
        }
        System.out.printf("모델 : %s\n배터리 : %d\n전원 상태 : %b", model, batteryLevel, isPowerOn);
    }




}
