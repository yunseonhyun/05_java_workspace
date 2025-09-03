package edu.polymorphism.pack3;

/**
 * 부모클래스
 */
public class 직원 {
    protected String name;
    protected String poisition;
    protected int salary;

    // 생서앚
    public 직원() {
    }

    public 직원(String name, String poisition, int salary) {
        this.name = name;
        this.poisition = poisition;
        this.salary = salary;
    }

    // 게터 세터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoisition() {
        return poisition;
    }

    public void setPoisition(String poisition) {
        this.poisition = poisition;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // toString
    @Override
    public String toString() {
        return "이름 ='" + name + '\'' +
                ", 직급 ='" + poisition + '\'' +
                ", 연봉 =" + salary;
    }
}
