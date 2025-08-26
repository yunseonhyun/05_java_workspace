package edu.practice.day1;

import java.util.Scanner;

public class Exercise3 {
    public void method1() {
        Scanner sc = new Scanner(System.in);

        final double RATIO = 9.0 / 5.0;
        final int OFFSET = 32;

        System.out.print("섭씨온도를 입력하세요 : ");
        double celsius = sc.nextDouble();

        // double fahrenheit = celsius * RATIO + OFFSET;
        // 추가문제 답안
        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.printf("섭씨 %.1f도는 화씨 %.1f도 입니다.", celsius, fahrenheit);
    }
}
