package edu.practice.day3;

import java.util.Scanner;

public class Practice4 {
    private String name; // 학생명
    private int studentId; // 학번
    private int[] scores = new int[5]; // 과목별 점수 배열 (5과목)
    private String[] subjects; // 과목명 배열

    // 기본 생성자
    public Practice4() {
        this.subjects = new String[]{"국어", "영어", "수학", "과학", "사회"};
    }


    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    // getter

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int[] getScores() {
        return scores;
    }

    public String[] getSubjects() {
        return subjects;
    }


    // 기능
    public void inputScore() {
        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수 : ");
        int score = sc.nextInt();
        scores[0] = score;
        System.out.println("영어 점수 : ");
        score = sc.nextInt();
        scores[1] = score;
        System.out.println("수학 점수 : ");
        score = sc.nextInt();
        scores[2] = score;
        System.out.println("과학 점수 : ");
        score = sc.nextInt();
        scores[3] = score;
        System.out.println("사회 점수 : ");
        score = sc.nextInt();
        scores[4] = score;

    }

    public void printReport() {
        System.out.println("국어 : " + scores[0]);
        System.out.println("영어 : " + scores[1]);
        System.out.println("수학 : " + scores[2]);
        System.out.println("과학 : " + scores[3]);
        System.out.println("사회 : " + scores[4]);
    }

    public void getGrade() {
        int sum = 0;
        double average = 0;
        String grade;

        for(int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        average = (double) sum / 5;
        System.out.println("총점 : " + sum + "점");
        System.out.printf("평균 : %.1f\n", average);

        if(average >= 90) {
            grade = "A";
        } else if(average >= 80) {
            grade = "B";
        } else if(average >= 70) {
            grade = "C";
        } else if(average >= 60) {
            grade = "D";
        } else grade = "F";

        System.out.println("학점 : " +  grade);
    }
}
