package edu.practice.day4;

import edu.oop.basic.Nation;

public class PracticeRun {
    public static void main(String[] args) {
        Student st1 = new Student("김자바", "2024001", 85);



        System.out.println("===== 학생 정보 관리 시스템 =====");
        st1.displayInfo();

        Student st2 = new Student("박코딩", "2024002", 45);

        st2.displayInfo();
    }
}
