package edu.polymorphism.pack1.ex2.model;

public class Professor extends UniverseMember {
    // 교수 정보 관련 필드들
    private String professorDepartment;
    private String professorOfficeLocation;
    private double professorSalary;

    public Professor() {
    }

    public Professor(String professorDepartment, String professorOfficeLocation, double professorSalary) {
        this.professorDepartment = professorDepartment;
        this.professorOfficeLocation = professorOfficeLocation;
        this.professorSalary = professorSalary;
    }


    public Professor(String name, String Id, String professorDepartment) {
        super(name, Id); // 교수님의 이름과 아이디는 UniverseMember 필드에 작성된 변수이름 사용
        this.professorDepartment = professorDepartment; // 교수님의 부서는 Professor 클래스에 작성된 변수이름 사용
    }

    public Professor(String name, String Id, String professorDepartment, String professorOfficeLocation, double professorSalary) {
        super(name, Id);
        this.professorDepartment = professorDepartment;
        this.professorOfficeLocation = professorOfficeLocation;
        this.professorSalary = professorSalary;
    }


    // 게터 세터
    public String getProfessorDepartment() {
        return professorDepartment;
    }

    public void setProfessorDepartment(String professorDepartment) {
        this.professorDepartment = professorDepartment;
    }

    public String getProfessorOfficeLocation() {
        return professorOfficeLocation;
    }

    public void setProfessorOfficeLocation(String professorOfficeLocation) {
        this.professorOfficeLocation = professorOfficeLocation;
    }

    public double getProfessorSalary() {
        return professorSalary;
    }

    public void setProfessorSalary(double professorSalary) {
        this.professorSalary = professorSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "professorDepartment='" + professorDepartment + '\'' +
                ", professorOfficeLocation='" + professorOfficeLocation + '\'' +
                ", professorSalary=" + professorSalary;
    }
}
