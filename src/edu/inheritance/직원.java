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

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // 공통 기능
    public void info() {
        System.out.println("=== 직원 정보 ===");
        // eName을 직접적으로 사용해도 되지만
        // eName을 직접적으로 사용하기 보다는 get을 활용해서 작성자
        System.out.println("이름 : " + geteName());
        System.out.println("사번 : " + geteId());
        System.out.println("부서 : " + getDepartment());
        System.out.println("기본급 : " + getBaseSalary() + "원");
    }
    /* 추후 과제
    // 급여 계산 - 자식 클래스에서 구체적으로 구현
    public double calculateSalary() {
        return baseSalary;
    }
    */

    // 업무 수행 - 자식 클래스에서 구체적으로 구현
    public void work() {
        System.out.println(geteName() + "님이 업무를 수행합니다.");
    }
}
