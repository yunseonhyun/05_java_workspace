package edu.practice.day2;

import java.util.Scanner;

public class Practice {
    /*
    * 문제 1번 : 짝수만 출력하기
    * */
    public void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int input1 = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int input2 = sc.nextInt();
        int min = Math.min(input1, input2);
        int max = Math.max(input1, input2);

        for(int i = min; i <= max; i++){
            if(i % 2 == 0){
                System.out.print(i);
            }
        }
    }

    /*
    * 문제 4번 : 소수 판별기
    * */
    public void method4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int number = sc.nextInt();
        boolean isPrime = true;

        if(number < 2){isPrime = false;
        }else {
            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime) {
            System.out.print(number + "은 소수입니다");
        }else {
            System.out.println(number + "은 소수가 아닙니다");
        }


    }

    /*
    * 문제 6번 : 숫자 맞히기 게임(1 ~50)
    * */
    public void method6() {
        Scanner sc = new Scanner(System.in);
        int answer = (int)(Math.random() * 50) + 1;

        int count = 0;
        final int MAX_TRIES = 7;
        System.out.print("1~50 사이의 숫자를 맞혀보세요!");

        while(count < MAX_TRIES){
            count++;
            int input = sc.nextInt();
            if(input == answer){
                System.out.println("정답입니다. 정답 : " + answer + ", 시도횟수 : " + count);
                break;
            } else if(input > answer){
                System.out.println("시도 " + count + "/7 : " + input);
                System.out.println("입력한 숫자보다 정답이 작습니다.");
            } else if(input < answer){
                System.out.println("시도 " + count + "/7 : " + input);
                System.out.println("입력한 숫자보다 정답이 큽니다.");
            }
        }
    }
}
