package edu.inheritance;

public class 직원 {
    // 필드 속성 인스턴스 변수
    private String eName; // 사원이름
    private int eId; // 사원번호
    private double baseSalary; // 기본급
    private String department; // 부서

    // 메서드 필드 이외에는 거의다 기능 = 메서드의 종류들
    // 생성자 매개변수생성자


    public 직원(String eName, int eId, double baseSalary, String department) {
        this.eName = eName;
        this.eId = eId;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    // 공통 기능
    public void info() {
        System.out.println("=== 직원 정보 ===");
        System.out.println("이름 : " + eName);
        System.out.println("사번 : " + eId);
        System.out.println("부서 : " + department);
        System.out.println("기본급 : " + baseSalary + "원");
    }
}
