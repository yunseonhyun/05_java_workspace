package edu.practice.day4;

public class Student {
    // 필드

    private String name;
    private String studentId;
    private int score;


    // 기본 생성자
    public Student() {
    }

    // 필수 생성자
    public Student(String name, String studentId, int score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setScore(int score) {
        this.score = score;
    }


    // getter
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getScore() {
        return score;
    }


    // 기능
    public String isPass() {
        /*if(score >= 60) {
          return "합격"; // 각각의 결과를 return으로 반환
        } else {
            return "불합격";
        }*/
        return (score >= 60) ? "합격" : "불합격";
    }

    public void displayInfo() {
        System.out.println("학생명 : " + getName());
        System.out.println("학번 : " + getStudentId());
        System.out.println("점수 : " + getScore() + "점");
        System.out.println("결과 : " + isPass());
        // 같은 클래스 내에서 메서드를 호출할 때
        // 클래스명칭이나 객체 변수명칭을 생약하고 호출할 수 있다.
        // return 값이 존재할 때



    }
}



