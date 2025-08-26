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


    /**
     * 문제 2번
     */

    public void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("높이를 입력하세요 : ");
        int heigth = sc.nextInt();

        for(int i = 1; i <= heigth; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 문제 3번
     */
    public void method3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("팩토리얼을 구할 숫자를 입력하세요 : ");
        int number = sc.nextInt();


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


    /**
     * 문제 7번 : 문자열 분석기
     */
    public void method7() {
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        // 위와 같이 클래스 파일을 가져올 때
        // 파일이 위치한 경로를 매번 앞에 작성하기 번거롭기 때문에
        // import를 사용하여 패키지 명칭 아래 맨 위에 작성해준다.
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 숫자 포함해서 입력해보세요 : ");
        String str = sc.nextLine();

        int totalCount = str.length(); // 사용자가 입력한 문자열의 전체 글자슈룰 세고 변수이름에 저장
        int letterCount = 0; // 문자열에서 글자의 개수
        int digitCount = 0; // 문자열에서 숫자의 개수
        int otherCount = 0; // 문자도 아니고 숫자도 아닌 것의 개수

        for(int i = 0; i < totalCount; i++){
            char ch = str.charAt(i); // i 번째 문자열을 ch라는 변수이름에 저장

            /** 문자가 숫자인지 글자인지 boolean(불리언) true false 형태로 결과를 확인
             * Character.isDigit(ch) = ch가 숫자라면 true
             *      => 숫자가 맞군요!
             * Character.isLetter(ch) = ch가 문자라면 true
             *      => 문자가 맞군요!
             */
            if(Character.isDigit(ch)){ // ch에 저장된 문자가 숫자라면
                digitCount++;          // 숫자 개수 +1 추가
            } else if(Character.isLetter(ch)){ // ch에 저장된 문자가 숫자가 아닌 글자라면
                letterCount++;                 // 문자 개수 +1 추가
            } else {
                otherCount++; // 글자도 아니고 숫자도 아닌 모든 경우 +1 추가
            }


        }
        System.out.println("\n=== 고객이 작성한 문자열에서 숫자와 문자의 개수 확인하기 ===");
        System.out.println("총 글자수 : " + totalCount);
        System.out.println("숫자 아닌 글자수 : " + letterCount);
        System.out.println("숫자 글자수 : " + digitCount);
        System.out.println("기타 문자(공백, 기호) : " + otherCount);

    }
}
