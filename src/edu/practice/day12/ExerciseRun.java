package edu.practice.day12;

import java.util.Scanner;

public class ExerciseRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercise1 e = new Exercise1();

        System.out.println("--- 문제 1 실행 ---");
        System.out.print("폴더 명칭 입력하세요 :");
        String dirName = sc.nextLine();
        System.out.print("파일 명칭 입력하세요 : ");
        String fileName = sc.nextLine();

        // e.method1(dirName, fileName);
        // e.method2(dirName, fileName);
        // e.method3(dirName, fileName);
        // e.method4();

        System.out.println("--- 문제 5 실행 ---");
        System.out.print("상위폴더 명칭 입력하세요 :");
        String 폴더1번 = sc.nextLine();
        System.out.print("중간 폴더 명칭 입력하세요 : ");
        String 폴더2번 = sc.nextLine();
        System.out.print("마지막 폴더 명칭 입력하세요 : ");
        String 폴더3번 = sc.nextLine();
         e.method5(폴더1번, 폴더2번, 폴더3번);
    }
}
