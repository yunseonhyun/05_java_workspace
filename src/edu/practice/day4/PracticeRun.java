package edu.practice.day4;

import edu.oop.basic.Nation;

public class PracticeRun {
    public static void main(String[] args) {
        // 문제 1번
        Student st1 = new Student("김자바", "2024001", 85);



        System.out.println("===== 학생 정보 관리 시스템 =====");
        st1.displayInfo();

        Student st2 = new Student("박코딩", "2024002", 45);

        st2.displayInfo();

        // 문제 3번
        CafeOrder co = new CafeOrder("김자바", "아메리카노", 4000, 1);
        co.printReceipt();
        co.placeOrder();
    }
}
