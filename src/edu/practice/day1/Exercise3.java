package edu.practice.day1;

import java.util.Scanner;

public class Exercise3 {
    public void Exercise3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("섭씨온도를 입력하세요 : ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.printf("섭씨 %f도는 화씨 %f도 입니다.", celsius, fahrenheit);
    }
}
