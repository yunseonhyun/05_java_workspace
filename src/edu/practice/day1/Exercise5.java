package edu.practice.day1;

import java.util.Scanner;

public class Exercise5 {
    /*
    * 기본 요구사랑 버전 기능
    * */
    public void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("출생년도를 입력하세요 : ");
        int birthyear = sc.nextInt();
        int currentAge = 2025 - birthyear;
        int futureAge = currentAge + 10;
        boolean isAdult = (currentAge >= 20);

        System.out.printf("======== 나이 정보 ========\n출생년도 : %d년\n현재 나이 : %d세\n10년 후 : %d세\n성인 여부 : %b",birthyear, currentAge, futureAge, isAdult);
    }

    /**int zodiacIndex = currentAge % 12
     * 추가 요구사항 버전 기능
     * 띠 계산 포함 버전
     */
    public void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("출생년도를 입력하세요 : ");
        int birthyear = sc.nextInt();
        int currentAge = 2025 - birthyear;
        int futureAge = currentAge + 10;
        boolean isAdult = (currentAge >= 20);

        // 띠 계산
        //          현재나이 % 12를 하면 해당하는 띠의 숫자로
        // + 더하기    - 빼기    * 곱하기   / 나누기(몫)    % 나누기(나머지)
        //int zodiacIndex = currentAge % 12; // 현재 나이이므로 띠가 변화
        int zodiacIndex = birthyear % 12;
        String[] zodiacAnimals = {
                "원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"
        };

        String zodiac = zodiacAnimals[zodiacIndex];


        System.out.printf("======== 나이 정보 ========\n출생년도 : %d년\n현재 나이 : %d세\n10년 후 : %d세\n성인 여부 : %b\n띠 : %s",birthyear, currentAge, futureAge, isAdult, zodiac);

    }
}
