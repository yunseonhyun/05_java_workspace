package edu.practice.day1;

import java.util.Scanner;

public class Exercise2 {
    public void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수입력 : ");
        int num1 = sc.nextInt();

        System.out.print("두번째 정수입력 : ");
        int num2 = sc.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = (double) num1 / num2;

        System.out.printf("=== 계산 결과 ===\n%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %.2f",num1, num2, add, num1, num2, sub, num1, num2, mul, num1, num2, div);
    }
}
